package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.data.api.PcsApi;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LiveLeadsEntranceCtrImprovementSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.IHostPCS;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0evA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1107300evA implements InterfaceC1107200ev0 {
    public final EnumC1107860ew4 LL;
    public final SubPinCard LLILLJJLI;
    public final Map<String, String> LLILLL;
    public final InterfaceC1107340evE LLILZ;
    public final LifecycleOwner LLILZIL;
    public View LLILZLL;
    public LiveIconView LLIZ;
    public C16F5 LLIZLLLIL;
    public C16F5 LLJ;
    public ViewGroup LLJI;
    public C23236098o LLJIJIL;
    public ViewGroup LLJILJIL;
    public View LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final C01GW LLJJI = C452501pT.LIZIZ(new C1107320evC(this));
    public final C01GW LLJJIII = C452501pT.LIZIZ(new C1107330evD(this));
    public final C01GW LLJJIJI = C452501pT.LIZIZ(new C1107280ev8());

    public boolean LJIIJ() {
        throw null;
    }

    public boolean LJIIJJI() {
        throw null;
    }

    public void LJIIIIZZ() {
        View view = this.LLILZLL;
        if (view != null) {
            this.LLIZ = (LiveIconView) view.findViewById(R.id.jjf);
            this.LLIZLLLIL = (C16F5) view.findViewById(R.id.jkq);
            this.LLJ = (C16F5) view.findViewById(R.id.title);
            this.LLJI = (ViewGroup) view.findViewById(R.id.e2p);
            this.LLJILJILJ = view.findViewById(R.id.e0u);
            this.LLJIJIL = (C23236098o) view.findViewById(R.id.f698e1b);
            this.LLJILJIL = (ViewGroup) view.findViewById(R.id.ezw);
        }
    }

    public final boolean LJIIIZ() {
        return ((Boolean) this.LLJJI.getValue()).booleanValue();
    }

    public void LJIIL() {
        if (this.LLJILLL) {
            return;
        }
        this.LLJILLL = true;
        EnumC1012360cS2 enumC1012360cS2LIZLLL = this.LLILZ.LIZLLL();
        EnumC1012360cS2 enumC1012360cS2 = EnumC1012360cS2.LIVE_ROOM_PIN_CARD;
        if (enumC1012360cS2LIZLLL == enumC1012360cS2) {
            C1107500evU c1107500evU = C1107500evU.LIZ;
            SubPinCard subPinCard = this.LLILLJJLI;
            boolean zLJIIIZ = LJIIIZ();
            Map<String, String> map = this.LLILLL;
            boolean zBooleanValue = ((Boolean) this.LLJJIJI.getValue()).booleanValue();
            c1107500evU.getClass();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_upsell_pin_card_show");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            String str = C1107500evU.LIZIZ.get(Integer.valueOf(subPinCard.type));
            if (str == null) {
                str = "";
            }
            c474500IjALIZ.LJJII(str, "upsell_method");
            c474500IjALIZ.LJJII(zLJIIIZ ? "anchor" : "audience", "user_type");
            c474500IjALIZ.LJJII(1, "is_native");
            if (!zLJIIIZ) {
                c474500IjALIZ.LJJII(Integer.valueOf(zBooleanValue ? 1 : 0), "is_ad_traffic");
            }
            if (subPinCard.type == 9) {
                c474500IjALIZ.LJJII(C1107500evU.LIZ(subPinCard), "third_party_service_name");
            }
            c474500IjALIZ.LIZ();
        }
        if (this.LLILLJJLI.pinSource == 2 && this.LLILZ.LIZLLL() != enumC1012360cS2) {
            C1107500evU c1107500evU2 = C1107500evU.LIZ;
            int i = this.LLILLJJLI.type;
            Map<String, String> map2 = this.LLILLL;
            c1107500evU2.getClass();
            C1107500evU.LIZIZ(i, "show", map2);
        }
        SubPinCard subPinCard2 = this.LLILLJJLI;
        if (subPinCard2.type == 6) {
            Map<String, String> map3 = this.LLILLL;
            String strValueOf = String.valueOf(subPinCard2.id);
            if (strValueOf == null) {
                strValueOf = "";
            }
            map3.put("course_id", strValueOf);
            C1107500evU.LIZJ(C1107500evU.LIZ, LJIIIZ(), "show", "", this.LLILLL);
        }
    }

    @Override // X.InterfaceC1107200ev0
    public final void onDestroy() {
        C23236098o c23236098o = this.LLJIJIL;
        if (c23236098o != null) {
            c23236098o.LJJJJI();
        }
    }

    public final void LJII(boolean z) {
        EnumC1108010ewJ enumC1108010ewJ;
        View view = this.LLILZLL;
        if (view != null) {
            C500260Jjc.LJIILIIL(view);
        }
        InterfaceC1107340evE interfaceC1107340evE = this.LLILZ;
        EnumC1107860ew4 enumC1107860ew4 = this.LL;
        if (z) {
            enumC1108010ewJ = EnumC1108010ewJ.MANUALLY_CLOSE;
        } else {
            enumC1108010ewJ = EnumC1108010ewJ.AUTO;
        }
        interfaceC1107340evE.LIZIZ(enumC1107860ew4, enumC1108010ewJ);
        if (this.LLILLJJLI.type == 6 && z) {
            C1107500evU.LIZJ(C1107500evU.LIZ, LJIIIZ(), "click", "close", this.LLILLL);
        }
    }

    public void LJIILIIL(final C1107290ev9 c1107290ev9) {
        AnonymousClass0956 anonymousClass0956;
        IHostPCS iHostPCS;
        boolean z;
        boolean z2;
        boolean z3;
        LiveIconView liveIconView;
        if (c1107290ev9.LIZIZ > 0) {
            C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(c1107290ev9.LIZIZ, C497740JfY.LJII());
            LiveIconView liveIconView2 = this.LLIZ;
            if (liveIconView2 != null) {
                liveIconView2.setIcon(c20743516FdLIZLLL);
            }
        }
        int i = c1107290ev9.LIZJ;
        if (i > 0 && (liveIconView = this.LLIZ) != null) {
            liveIconView.setIconTintAttr(i);
        }
        LiveIconView liveIconView3 = this.LLIZ;
        if (liveIconView3 != null) {
            if (c1107290ev9.LIZIZ > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            C500260Jjc.LJLJLJ(liveIconView3, z3);
        }
        C16F5 c16f5 = this.LLIZLLLIL;
        if (c16f5 != null) {
            c16f5.setText(c1107290ev9.LIZLLL);
        }
        C16F5 c16f52 = this.LLIZLLLIL;
        if (c16f52 != null) {
            if (c1107290ev9.LIZLLL.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            C500260Jjc.LJLJLJ(c16f52, z2);
        }
        C16F5 c16f53 = this.LLJ;
        if (c16f53 != null) {
            c16f53.setText(c1107290ev9.LJ);
        }
        C16F5 c16f54 = this.LLJ;
        if (c16f54 != null) {
            if (c1107290ev9.LJ.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            C500260Jjc.LJLJLJ(c16f54, z);
        }
        View view = this.LLJILJILJ;
        if (view != null) {
            C500260Jjc.LJLJLJ(view, false);
        }
        C500260Jjc.LJLJLJ(this.LLJI, false);
        C500260Jjc.LJLJLJ(this.LLJILJIL, false);
        C23236098o c23236098o = this.LLJIJIL;
        if (c23236098o != null) {
            C500260Jjc.LJLJLJ(c23236098o, false);
        }
        if (!LJIIJ()) {
            View view2 = this.LLILZLL;
            if (view2 != null) {
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0evF
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        this.LL.LLILZ.LIZJ();
                    }
                }, view2);
            }
            View view3 = this.LLJILJILJ;
            if (view3 != null) {
                C500260Jjc.LJLJLJ(view3, true);
            }
            String str = c1107290ev9.LJFF;
            View view4 = this.LLJILJILJ;
            if (view4 instanceof C16FS) {
                ((C16FS) view4).setText(str);
            } else if (view4 instanceof C197039127h) {
                ((TextView) view4).setText(str);
            }
            View view5 = this.LLJILJILJ;
            if (view5 != null) {
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0evB
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        String str2;
                        C1107300evA c1107300evA = this.LL;
                        c1107300evA.LLILZ.LJFF(c1107300evA.LLILLJJLI, c1107290ev9.LJI);
                        if (c1107300evA.LLILLJJLI.pinSource == 2 && c1107300evA.LLILZ.LIZLLL() != EnumC1012360cS2.LIVE_ROOM_PIN_CARD) {
                            C1107500evU c1107500evU = C1107500evU.LIZ;
                            int i2 = c1107300evA.LLILLJJLI.type;
                            Map<String, String> map = c1107300evA.LLILLL;
                            c1107500evU.getClass();
                            C1107500evU.LIZIZ(i2, "click", map);
                        } else if (c1107300evA.LLILZ.LIZLLL() == EnumC1012360cS2.LIVE_ROOM_PIN_CARD) {
                            C1107500evU c1107500evU2 = C1107500evU.LIZ;
                            SubPinCard subPinCard = c1107300evA.LLILLJJLI;
                            boolean zLJIIIZ = c1107300evA.LJIIIZ();
                            Map<String, String> map2 = c1107300evA.LLILLL;
                            boolean zBooleanValue = ((Boolean) c1107300evA.LLJJIJI.getValue()).booleanValue();
                            c1107500evU2.getClass();
                            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_upsell_pin_card_click");
                            c474500IjALIZ.LJIL();
                            c474500IjALIZ.LJJIIZI(map2);
                            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
                            String str3 = C1107500evU.LIZIZ.get(Integer.valueOf(subPinCard.type));
                            if (str3 == null) {
                                str3 = "";
                            }
                            c474500IjALIZ.LJJII(str3, "upsell_method");
                            if (zLJIIIZ) {
                                str2 = "anchor";
                            } else {
                                str2 = "audience";
                            }
                            c474500IjALIZ.LJJII(str2, "user_type");
                            c474500IjALIZ.LJJII(1, "is_native");
                            if (!zLJIIIZ) {
                                c474500IjALIZ.LJJII(Integer.valueOf(zBooleanValue ? 1 : 0), "is_ad_traffic");
                            }
                            if (subPinCard.type == 9) {
                                c474500IjALIZ.LJJII(C1107500evU.LIZ(subPinCard), "third_party_service_name");
                            }
                            c474500IjALIZ.LIZ();
                        }
                        if (c1107300evA.LLILLJJLI.type == 6) {
                            C1107500evU.LIZJ(C1107500evU.LIZ, c1107300evA.LJIIIZ(), "click", "button", c1107300evA.LLILLL);
                        }
                    }
                }, view5);
            }
            C500260Jjc.LJLJLJ(this.LLJI, true);
            ViewGroup viewGroup = this.LLJI;
            if (viewGroup != null) {
                C786410Ut5.K7(viewGroup, new View.OnClickListener() { // from class: X.0evH
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view6) {
                        this.LL.LJII(true);
                    }
                });
            }
            if (this.LLILZ.LIZLLL() != EnumC1012360cS2.LIVE_ROOM_PIN_CARD && (iHostPCS = (IHostPCS) C1161920gLG.LIZJ(IHostPCS.class)) != null) {
                iHostPCS.GP(this.LLJI);
                iHostPCS.jU0(this.LLJILJILJ);
            }
            C16F5 c16f55 = this.LLJ;
            if (c16f55 != null) {
                ViewGroup.LayoutParams layoutParams = c16f55.getLayoutParams();
                if (layoutParams != null) {
                    C19ME c19me = (C19ME) layoutParams;
                    c19me.setMarginEnd((int) C497740JfY.LIZIZ(4.0f));
                    c19me.endToStart = R.id.e0u;
                    c19me.endToEnd = -1;
                    C786410Ut5.W5(c16f55, c19me);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
            }
        } else {
            C500260Jjc.LJLJLJ(this.LLJILJIL, true);
            C23236098o c23236098o2 = this.LLJIJIL;
            if (c23236098o2 != null) {
                C500260Jjc.LJLJLJ(c23236098o2, true);
            }
            C23236098o c23236098o3 = this.LLJIJIL;
            if (c23236098o3 != null) {
                long j = c1107290ev9.LJII * ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                boolean zLJIIJJI = LJIIJJI();
                C1107380evI c1107380evI = new C1107380evI(this);
                if (j > 0 && ((anonymousClass0956 = c23236098o3.LLJJI) == null || !anonymousClass0956.isActive())) {
                    c23236098o3.LJJJJIZL(j);
                    c23236098o3.LLJJI = C09IC.LJJI(c23236098o3.LLJJ, new C861640Xr8(new C23233098l(zLJIIJJI, c23236098o3, null), new C2325381G0q(new C347601Wo(c1107380evI, c23236098o3, null), new C095D(new C347201Wk(1000L, j, null)), 0)));
                }
            }
        }
        View view6 = this.LLILZLL;
        if (view6 != null) {
            C500260Jjc.LLFFF(view6);
        }
        LJIIL();
    }

    @Override // X.InterfaceC1107200ev0
    public final void LIZ(EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
        this.LLJJ = false;
        C23236098o c23236098o = this.LLJIJIL;
        if (c23236098o != null) {
            c23236098o.LJJJJI();
        }
    }

    @Override // X.InterfaceC1107200ev0
    public final void LLLZIIL(View view, Map<String, ? extends Object> map) {
        C1107290ev9 c1107290ev9;
        Room room;
        final boolean z;
        String secUid;
        boolean z2 = true;
        this.LLJJ = true;
        View view2 = this.LLILZLL;
        if (view2 != null) {
            C500260Jjc.LJIILIIL(view2);
        }
        LJIIIIZZ();
        C0JMF c0jmf = C0JMF.LIZ;
        SubPinCard subPinCard = this.LLILLJJLI;
        c0jmf.getClass();
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Room room2 = (Room) dataChannelGlobal.gg0(C930940aKi.class);
        int i = subPinCard.type;
        int i2 = R.attr.f01;
        if (i != 3) {
            if (i != 4) {
                if (i != 7) {
                    if (i != 8) {
                        if (i != 9) {
                            final boolean zIsAdmin = this.LLILZ.isAdmin();
                            SubPinCard subPinCard2 = this.LLILLJJLI;
                            LifecycleOwner lifecycleOwner = this.LLILZIL;
                            final C1107360evG c1107360evG = new C1107360evG(this);
                            if (subPinCard2.type == 6 && (room = (Room) dataChannelGlobal.gg0(C930940aKi.class)) != null) {
                                if (room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                long j = subPinCard2.id;
                                String strLIZ = subPinCard2.actionSchema;
                                if (strLIZ.length() != 0) {
                                    z2 = false;
                                }
                                String str = "";
                                if (z2) {
                                    InterfaceC1107390evJ interfaceC1107390evJIS1 = ((IPcsService) C1161920gLG.LIZJ(IPcsService.class)).IS1();
                                    String strValueOf = String.valueOf(j);
                                    String strValueOf2 = String.valueOf(room.getOwnerUserId());
                                    User owner = room.getOwner();
                                    if (owner == null || (secUid = owner.getSecUid()) == null) {
                                        secUid = "";
                                    }
                                    strLIZ = interfaceC1107390evJIS1.LIZ(strValueOf, strValueOf2, secUid, String.valueOf(room.getId()), false);
                                }
                                final C1107290ev9 c1107290ev92 = new C1107290ev9();
                                c1107290ev92.LIZ = 6;
                                c1107290ev92.LIZLLL = C0JMF.LIZJ(subPinCard2, C497740JfY.LJIJI(2131855776));
                                c1107290ev92.LJFF = C497740JfY.LJIJI(2131855280);
                                if (strLIZ != null) {
                                    str = strLIZ;
                                }
                                c1107290ev92.LJI = str;
                                c1107360evG.invoke(c1107290ev92);
                                C480460Ism.LIZ().getClass();
                                ((C0J1N) C1808280x9m.LJFF(((PcsApi) C480460Ism.LIZLLL(PcsApi.class)).loadCourseDetail(room.getOwnerUserId(), j, 5, C518500KVc.LIZ()).LJL(C11S5.LIZ()), "course_pin_card", "/smb/course/detail/", null, 12).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZJ(C11RD.LJ(lifecycleOwner))).LIZ(new C09JN() { // from class: X.0Jyp
                                    /* JADX WARN: Removed duplicated region for block: B:40:0x008e A[PHI: r4
                                      0x008e: PHI (r4v2 java.lang.String) = (r4v1 java.lang.String), (r4v4 java.lang.String) binds: [B:38:0x008b, B:34:0x0070] A[DONT_GENERATE, DONT_INLINE]] */
                                    @Override // X.C09JN
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final void accept(java.lang.Object r12) {
                                        /*
                                            r11 = this;
                                            java.lang.String r10 = "PinCardConfigFactory@7960.getCoursePinCardConfig$1"
                                            X.C1C7U.LIZ(r10)
                                            com.bytedance.android.live.network.response.BaseResponse r12 = (com.bytedance.android.live.network.response.BaseResponse) r12
                                            T r0 = r12.data
                                            webcast.api.smb.GetSMBCourseDetailResponse$Data r0 = (webcast.api.smb.GetSMBCourseDetailResponse.Data) r0
                                            com.bytedance.android.livesdk.chatroom.api.SMBCourse r7 = r0.course
                                            java.util.List<webcast.api.sub.TemplateInfo> r0 = r0.templateList
                                            r9 = 0
                                            java.lang.Object r8 = X.C13LP.LJJJLZIJ(r9, r0)
                                            webcast.api.sub.TemplateInfo r8 = (webcast.api.sub.TemplateInfo) r8
                                            X.0ev9 r6 = r1
                                            boolean r4 = r3
                                            boolean r3 = r4
                                            java.lang.String r5 = ""
                                            if (r7 == 0) goto L28
                                            com.bytedance.android.livesdk.chatroom.api.ContentAuditStatus r0 = r7.pinText
                                            if (r0 == 0) goto L28
                                            java.lang.String r0 = r0.content
                                            if (r0 != 0) goto L29
                                        L28:
                                            r0 = r5
                                        L29:
                                            r6.LIZLLL = r0
                                            if (r7 == 0) goto L93
                                            int r2 = r7.validVideoCount
                                        L2f:
                                            r0 = 1
                                            java.lang.Object[] r1 = new java.lang.Object[r0]
                                            if (r7 == 0) goto L91
                                            int r0 = r7.validVideoCount
                                        L36:
                                            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                                            r1[r9] = r0
                                            r0 = 2131755959(0x7f1003b7, float:1.9142812E38)
                                            java.lang.String r0 = X.C497740JfY.LJIIL(r0, r2, r1)
                                            r6.LJ = r0
                                            if (r4 != 0) goto L66
                                            if (r3 != 0) goto L66
                                            if (r8 == 0) goto L4f
                                            java.lang.String r0 = r8.moneyDisplay
                                            if (r0 != 0) goto L50
                                        L4f:
                                            r0 = r5
                                        L50:
                                            r6.LJIIJJI = r0
                                        L52:
                                            if (r7 == 0) goto L59
                                            java.lang.String r0 = r7.coverUrl
                                            if (r0 == 0) goto L59
                                            r5 = r0
                                        L59:
                                            r6.LJIIIIZZ = r5
                                            kotlin.jvm.functions.Function1<X.0ev9, kotlin.Unit> r1 = r2
                                            X.0ev9 r0 = r1
                                            r1.invoke(r0)
                                            X.C1C7U.LIZIZ(r10)
                                            return
                                        L66:
                                            if (r7 == 0) goto L8a
                                            com.bytedance.android.livesdk.chatroom.api.SubPackagePriceInfo r0 = r7.priceInfo
                                            if (r0 == 0) goto L8a
                                            java.lang.String r4 = r0.localCurrencySymbol
                                        L6e:
                                            com.bytedance.android.livesdk.chatroom.api.SubPackagePriceInfo r0 = r7.priceInfo
                                            if (r0 == 0) goto L8e
                                            long r2 = r0.localPriceAmountMicros
                                        L74:
                                            r0 = 1000000(0xf4240, float:1.401298E-39)
                                            long r0 = (long) r0
                                            long r2 = r2 / r0
                                            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
                                            r0.append(r4)
                                            r0.append(r2)
                                            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
                                            r6.LJIIJJI = r0
                                            goto L52
                                        L8a:
                                            r4 = 0
                                            if (r7 == 0) goto L8e
                                            goto L6e
                                        L8e:
                                            r2 = 0
                                            goto L74
                                        L91:
                                            r0 = 0
                                            goto L36
                                        L93:
                                            r2 = 0
                                            goto L2f
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: X.C509690Jyp.accept(java.lang.Object):void");
                                    }
                                }, new C09JN() { // from class: X.0Jyq
                                    @Override // X.C09JN
                                    public final void accept(Object obj) {
                                        C1C7U.LIZ("PinCardConfigFactory@7960.getCoursePinCardConfig$2");
                                        c1107360evG.invoke(null);
                                        C1C7U.LIZIZ("PinCardConfigFactory@7960.getCoursePinCardConfig$2");
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        c1107290ev9 = new C1107290ev9();
                        c1107290ev9.LIZ = subPinCard.type;
                        c1107290ev9.LJ = C0JMF.LIZIZ(subPinCard, C497740JfY.LJIJI(2131856143));
                        c1107290ev9.LIZLLL = C0JMF.LIZJ(subPinCard, C497740JfY.LJIJI(2131856142));
                        c1107290ev9.LJFF = C497740JfY.LJIJI(2131856039);
                        c1107290ev9.LJI = subPinCard.actionSchema;
                    } else {
                        c1107290ev9 = new C1107290ev9();
                        c1107290ev9.LIZ = subPinCard.type;
                        c1107290ev9.LJ = C0JMF.LIZIZ(subPinCard, C497740JfY.LJIJI(2131851503));
                        c1107290ev9.LIZIZ = R.attr.d09;
                        c1107290ev9.LIZJ = R.attr.c9q;
                        c1107290ev9.LIZLLL = C0JMF.LIZJ(subPinCard, C497740JfY.LJIJI(2131851496));
                        c1107290ev9.LJFF = C497740JfY.LJIJI(2131856039);
                        c1107290ev9.LJI = subPinCard.actionSchema;
                    }
                } else {
                    c1107290ev9 = new C1107290ev9();
                    c1107290ev9.LIZ = 7;
                    c1107290ev9.LJ = C497740JfY.LJIJI(2131856011);
                    c1107290ev9.LIZLLL = C497740JfY.LJIJI(2131856010);
                    c1107290ev9.LJFF = C497740JfY.LJIJI(2131855280);
                    c1107290ev9.LJI = subPinCard.actionSchema;
                }
            } else {
                String strLIZ2 = C0JMF.LIZ(c0jmf, subPinCard.actionSchema, room2);
                c1107290ev9 = new C1107290ev9();
                c1107290ev9.LIZ = 4;
                c1107290ev9.LJ = C0JMF.LIZIZ(subPinCard, C497740JfY.LJIJI(2131836438));
                c1107290ev9.LIZIZ = R.attr.d4_;
                c1107290ev9.LIZJ = R.attr.f01;
                c1107290ev9.LIZLLL = C0JMF.LIZJ(subPinCard, C497740JfY.LJIJI(2131836439));
                c1107290ev9.LJFF = C497740JfY.LJIJI(2131836441);
                c1107290ev9.LJI = strLIZ2;
            }
        } else {
            c1107290ev9 = new C1107290ev9();
            c1107290ev9.LIZ = 3;
            c1107290ev9.LJ = C0JMF.LIZIZ(subPinCard, C497740JfY.LJIJI(2131836436));
            c1107290ev9.LIZIZ = R.attr.e6a;
            c1107290ev9.LIZLLL = C0JMF.LIZJ(subPinCard, C497740JfY.LJIJI(2131836437));
            if (!LiveLeadsEntranceCtrImprovementSetting.INSTANCE.displayUpdatedIcon()) {
                i2 = R.attr.f00;
            }
            c1107290ev9.LIZJ = i2;
            c1107290ev9.LJFF = C497740JfY.LJIJI(2131836440);
            c1107290ev9.LJI = subPinCard.actionSchema;
        }
        LJIILIIL(c1107290ev9);
    }

    public C1107300evA(EnumC1107860ew4 enumC1107860ew4, SubPinCard subPinCard, Map<String, String> map, InterfaceC1107340evE interfaceC1107340evE, LifecycleOwner lifecycleOwner) {
        this.LL = enumC1107860ew4;
        this.LLILLJJLI = subPinCard;
        this.LLILLL = map;
        this.LLILZ = interfaceC1107340evE;
        this.LLILZIL = lifecycleOwner;
    }
}
