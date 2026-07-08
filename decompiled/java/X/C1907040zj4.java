package X;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mob.record.IRecordMobService;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeExtraData;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.shortvideo.FromGroupPropService;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zj4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907040zj4 {
    public static List LIZ(int i) {
        ArrayList arrayList = new ArrayList();
        if (i == 212) {
            arrayList.add(new C1907660zk4());
        } else {
            if (i == 225) {
                arrayList.add(new InterfaceC1906920zis() { // from class: X.0zj5
                    @Override // X.InterfaceC1906920zis
                    public final void LIZ(C1907600zjy c1907600zjy) {
                    }

                    @Override // X.InterfaceC1906920zis
                    public final void LIZJ(C1907600zjy c1907600zjy) {
                    }

                    /* JADX WARN: Removed duplicated region for block: B:29:0x005e A[PHI: r1
                      0x005e: PHI (r1v8 java.lang.String) = (r1v5 java.lang.String), (r1v9 java.lang.String) binds: [B:28:0x005c, B:26:0x0059] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x0079 A[PHI: r1
                      0x0079: PHI (r1v10 java.lang.String) = (r1v3 java.lang.String), (r1v11 java.lang.String) binds: [B:21:0x0049, B:19:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC1906920zis
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean LIZIZ(X.C1907070zj7 r7) {
                        /*
                            r6 = this;
                            X.0zjd r1 = r7.LIZLLL
                            X.0zjd r0 = X.EnumC1907390zjd.Root
                            r5 = 0
                            if (r1 != r0) goto L78
                            com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r0 = r7.LIZ
                            r3 = 0
                            if (r0 == 0) goto L7e
                            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate r0 = r0.uiTemplate
                            if (r0 == 0) goto L7e
                            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.TitleTemplate r0 = r0.titleTemplate
                            if (r0 == 0) goto L7e
                            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r0.fromUsers
                            if (r0 == 0) goto L7e
                            java.lang.Object r2 = X.C13LP.LJJJLL(r0)
                            com.ss.android.ugc.aweme.profile.model.User r2 = (com.ss.android.ugc.aweme.profile.model.User) r2
                        L1e:
                            java.lang.String r1 = r7.LJFF
                            X.09Gk r4 = new X.09Gk
                            r4.<init>()
                            java.lang.String r0 = "enter_from"
                            r4.LJIIIIZZ(r0, r1)
                            if (r2 == 0) goto L30
                            java.lang.String r3 = r2.getUid()
                        L30:
                            java.lang.String r0 = "to_user_id"
                            r4.LJIIIIZZ(r0, r3)
                            java.lang.String r1 = "enter_method"
                            java.lang.String r0 = "click_cell"
                            r4.LJIIIIZZ(r1, r0)
                            X.1D0F r3 = X.C1D0F.LIZ
                            java.lang.String r2 = ""
                            if (r3 == 0) goto L48
                            java.lang.String r1 = r3.LIZ()
                            if (r1 != 0) goto L79
                        L48:
                            r1 = r2
                            if (r3 != 0) goto L79
                            r0 = 0
                        L4c:
                            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                            r4.LJ(r0, r1)
                            if (r3 == 0) goto L5b
                            java.lang.String r1 = r3.LIZIZ()
                            if (r1 != 0) goto L5e
                        L5b:
                            r1 = r2
                            if (r3 == 0) goto L65
                        L5e:
                            java.lang.String r0 = r3.LIZJ()
                            if (r0 == 0) goto L65
                            r2 = r0
                        L65:
                            r4.LJIIIIZZ(r1, r2)
                            java.lang.String r2 = "profile_entrance_id"
                            long r0 = java.lang.System.currentTimeMillis()
                            r4.LIZLLL(r0, r2)
                            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
                            java.lang.String r0 = "enter_personal_detail"
                            X.C20684815ws.LJIILLIIL(r0, r1)
                        L78:
                            return r5
                        L79:
                            boolean r0 = r3.isConnected()
                            goto L4c
                        L7e:
                            r2 = r3
                            goto L1e
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1907050zj5.LIZIZ(X.0zj7):boolean");
                    }
                });
                return arrayList;
            }
            if (i == 265) {
                arrayList.add(new InterfaceC1906920zis() { // from class: X.0mTr
                    @Override // X.InterfaceC1906920zis
                    public final void LIZ(C1907600zjy c1907600zjy) {
                    }

                    @Override // X.InterfaceC1906920zis
                    public final void LIZJ(C1907600zjy c1907600zjy) {
                    }

                    @Override // X.InterfaceC1906920zis
                    public final boolean LIZIZ(C1907070zj7 c1907070zj7) {
                        Integer numValueOf;
                        ArrayList arrayListLJ;
                        String str;
                        Object c098200Yq;
                        String strOptString;
                        NewFaceStickerBean newFaceStickerBean;
                        NewFaceStickerBean newFaceStickerBean2;
                        Object c098200Yq2;
                        String strOptString2;
                        List<String> listSingletonList;
                        NewFaceStickerBean newFaceStickerBean3;
                        String str2;
                        View view = c1907070zj7.LIZIZ;
                        Object obj = null;
                        if (view != null) {
                            numValueOf = Integer.valueOf(view.getId());
                        } else {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            if (numValueOf.intValue() != R.id.pf1 && numValueOf.intValue() != R.id.tlt && numValueOf.intValue() != R.id.tlu) {
                                if (numValueOf.intValue() == R.id.pe9 || numValueOf.intValue() == R.id.pds) {
                                    Context context = c1907070zj7.LIZIZ.getContext();
                                    final GeneralTemplateNotice generalTemplateNotice = c1907070zj7.LIZ;
                                    C1393930mNT c1393930mNT = new C1393930mNT();
                                    c1393930mNT.LIZ = UUID.randomUUID().toString();
                                    c1393930mNT.LIZIZ = "friends_effect";
                                    c1393930mNT.LJ = "notification_page";
                                    c1393930mNT.LJIIIIZZ = "notification_button";
                                    String str3 = generalTemplateNotice.messageExtra;
                                    if (str3 != null) {
                                        try {
                                            c098200Yq2 = new JSONObject(str3);
                                            C189200o6.m2constructorimpl(c098200Yq2);
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            c098200Yq2 = new C098200Yq(th);
                                            C189200o6.m2constructorimpl(c098200Yq2);
                                        }
                                        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                                            obj = c098200Yq2;
                                        }
                                        JSONObject jSONObject = (JSONObject) obj;
                                        if (jSONObject != null && (strOptString2 = jSONObject.optString("from_user_id")) != null) {
                                            c1393930mNT.LJIILL = strOptString2;
                                        }
                                    }
                                    c1393930mNT.LJIILIIL = new InterfaceC19340210lU() { // from class: X.0mTs
                                        @Override // X.InterfaceC19340210lU
                                        public final void LIZ(Effect effect, String str4) {
                                            Object c098200Yq3;
                                            String strOptString3;
                                            C2344009Gk c2344009Gk = new C2344009Gk();
                                            GeneralTemplateNotice generalTemplateNotice2 = generalTemplateNotice;
                                            c2344009Gk.LJFF("prop_resource_id", effect.getResourceId());
                                            FromGroupPropService fromGroupPropService = (FromGroupPropService) ServiceManager.get().getService(FromGroupPropService.class);
                                            if (fromGroupPropService != null) {
                                                c2344009Gk.LJFF("from_group_id_prop_list", fromGroupPropService.LIZJ());
                                                c2344009Gk.LJFF("from_group_id_prop_resource_list", fromGroupPropService.LIZLLL());
                                            }
                                            c2344009Gk.LJFF("enter_method", "notification_button");
                                            c2344009Gk.LIZJ(C1443560nfW.LJIIIIZZ, "from_aigc_theme_status");
                                            String str5 = generalTemplateNotice2.messageExtra;
                                            if (str5 != null) {
                                                try {
                                                    c098200Yq3 = new JSONObject(str5);
                                                    C189200o6.m2constructorimpl(c098200Yq3);
                                                } catch (Throwable th2) {
                                                    TryCatchGuardChecker.doCheck(th2);
                                                    c098200Yq3 = new C098200Yq(th2);
                                                    C189200o6.m2constructorimpl(c098200Yq3);
                                                }
                                                if (C189200o6.m7isFailureimpl(c098200Yq3)) {
                                                    c098200Yq3 = null;
                                                }
                                                JSONObject jSONObject2 = (JSONObject) c098200Yq3;
                                                if (jSONObject2 != null && (strOptString3 = jSONObject2.optString("from_user_id")) != null) {
                                                    c2344009Gk.LJFF("from_user_id", strOptString3);
                                                }
                                            }
                                            ((IRecordMobService) ServiceManager.get().getService(IRecordMobService.class)).LIZLLL(new C1449410nox(str4, "friends_effect", "notification_page", null, null, null, null, null, 248), c2344009Gk.LIZ);
                                        }
                                    };
                                    C116L c116lLIZ = c1393930mNT.LIZ();
                                    boolean zDownloadEffectOrMusicAfterEnterCamera = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
                                    IPropReuseService iPropReuseService = (IPropReuseService) ServiceManager.get().getService(IPropReuseService.class);
                                    NoticeExtraData noticeExtraData = generalTemplateNotice.extraData;
                                    if (noticeExtraData == null || (newFaceStickerBean3 = noticeExtraData.sticker) == null || (str2 = newFaceStickerBean3.id) == null || (listSingletonList = Collections.singletonList(str2)) == null) {
                                        listSingletonList = C13BV.INSTANCE;
                                    }
                                    iPropReuseService.LJFF(context, listSingletonList, c116lLIZ, zDownloadEffectOrMusicAfterEnterCamera);
                                    return true;
                                }
                            } else {
                                Context context2 = c1907070zj7.LIZIZ.getContext();
                                GeneralTemplateNotice generalTemplateNotice2 = c1907070zj7.LIZ;
                                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context2, "aweme://aweme/detail/");
                                smartRouteBuildRoute.withParam("refer", "prop_page");
                                smartRouteBuildRoute.withParam("video_from", "from_inbox_sticker");
                                smartRouteBuildRoute.withParam("previous_page", "notification_page");
                                smartRouteBuildRoute.withParam("video_type", 37);
                                NoticeExtraData noticeExtraData2 = generalTemplateNotice2.extraData;
                                if (noticeExtraData2 != null && (newFaceStickerBean2 = noticeExtraData2.sticker) != null) {
                                    arrayListLJ = C1697810uHb.LJ(newFaceStickerBean2);
                                } else {
                                    arrayListLJ = null;
                                }
                                smartRouteBuildRoute.withParam("feed_data_sticker_model", arrayListLJ);
                                NoticeExtraData noticeExtraData3 = generalTemplateNotice2.extraData;
                                if (noticeExtraData3 != null && (newFaceStickerBean = noticeExtraData3.sticker) != null) {
                                    str = newFaceStickerBean.id;
                                } else {
                                    str = null;
                                }
                                smartRouteBuildRoute.withParam("sticker_id", str);
                                String str4 = generalTemplateNotice2.messageExtra;
                                if (str4 != null) {
                                    try {
                                        c098200Yq = new JSONObject(str4);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                        c098200Yq = new C098200Yq(th2);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    }
                                    if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                                        obj = c098200Yq;
                                    }
                                    JSONObject jSONObject2 = (JSONObject) obj;
                                    if (jSONObject2 != null && (strOptString = jSONObject2.optString("from_user_id")) != null) {
                                        smartRouteBuildRoute.withParam("from_user_id", strOptString);
                                    }
                                }
                                smartRouteBuildRoute.open();
                                return true;
                            }
                        }
                        return false;
                    }
                });
                return arrayList;
            }
            if (C1697810uHb.LJIIJJI(281, 261, 250, 228, 20030, 20116, 20117, 20118, 20146, 20149, 20119, 20120, 20138).contains(Integer.valueOf(i))) {
                arrayList.add(new InterfaceC1906920zis() { // from class: X.0zj1
                    @Override // X.InterfaceC1906920zis
                    public final void LIZ(C1907600zjy c1907600zjy) {
                    }

                    @Override // X.InterfaceC1906920zis
                    public final void LIZJ(C1907600zjy c1907600zjy) {
                    }

                    public static String LIZLLL(String str) {
                        if (C703302op.LIZ(str) && u.LJJIIJZLJL(str, "aweme://aweme/detail/", false)) {
                            Matcher matcher = PatternProtector.compile("\\d+\\d").matcher(str);
                            if (matcher.find()) {
                                return matcher.group();
                            }
                            return null;
                        }
                        return null;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:136:0x01ff  */
                    /* JADX WARN: Removed duplicated region for block: B:151:0x0264  */
                    /* JADX WARN: Removed duplicated region for block: B:162:0x0288  */
                    /* JADX WARN: Removed duplicated region for block: B:163:0x028f A[PHI: r5
                      0x028f: PHI (r5v1 java.util.List<com.ss.android.ugc.aweme.profile.model.User>) = 
                      (r5v0 java.util.List<com.ss.android.ugc.aweme.profile.model.User>)
                      (r5v0 java.util.List<com.ss.android.ugc.aweme.profile.model.User>)
                      (r5v0 java.util.List<com.ss.android.ugc.aweme.profile.model.User>)
                      (r5v3 java.util.List<com.ss.android.ugc.aweme.profile.model.User>)
                      (r5v3 java.util.List<com.ss.android.ugc.aweme.profile.model.User>)
                     binds: [B:124:0x01e4, B:126:0x01e8, B:128:0x01ec, B:130:0x01f0, B:132:0x01f6] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC1906920zis
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final boolean LIZIZ(X.C1907070zj7 r11) {
                        /*
                            Method dump skipped, instruction units count: 665
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1907010zj1.LIZIZ(X.0zj7):boolean");
                    }

                    public static String LJ(String str, String str2) {
                        boolean z;
                        if (str != null && str.length() != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
                        if (z) {
                            return null;
                        }
                        try {
                            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), str2);
                            return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                        }
                    }
                });
                return arrayList;
            }
            if (i == 23) {
                arrayList.add(new InterfaceC1906920zis() { // from class: X.0zj6
                    @Override // X.InterfaceC1906920zis
                    public final void LIZ(C1907600zjy c1907600zjy) {
                    }

                    @Override // X.InterfaceC1906920zis
                    public final void LIZJ(C1907600zjy c1907600zjy) {
                    }

                    @Override // X.InterfaceC1906920zis
                    public final boolean LIZIZ(C1907070zj7 c1907070zj7) {
                        View view;
                        AbstractViewOnClickListenerC1907000zj0 abstractViewOnClickListenerC1907000zj0;
                        RecyclerView.ViewHolder viewHolder = c1907070zj7.LJIIIIZZ;
                        if (viewHolder != null && (view = viewHolder.itemView) != null && (abstractViewOnClickListenerC1907000zj0 = (AbstractViewOnClickListenerC1907000zj0) view.findViewById(R.id.peb)) != null) {
                            return abstractViewOnClickListenerC1907000zj0.LIZLLL(c1907070zj7.LIZIZ);
                        }
                        return false;
                    }
                });
                return arrayList;
            }
        }
        return arrayList;
    }
}
