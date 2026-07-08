package X;

import Y.ATListenerS450S0100000_17;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.AwS59S0301000_17;
import kotlin.jvm.internal.AwS631S0100000_17;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fQt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126970fQt extends AbstractC1126560fQE {
    public final View LLLILZ;
    public final List<AbstractC1126600fQI<? extends AnonymousClass0054>> LLLILZJ;
    public final String LLLILZLLLI;
    public final C16F5 LLLIZZ;
    public final C16F5 LLLJ;
    public final View LLLJIL;
    public final C1126220fPg LLLJL;
    public final C16F5 LLLL;
    public final View LLLLII;
    public final C1324720kZq LLLLIIIILLL;
    public int LLLLIIL;
    public DataChannel LLLLIILL;
    public int LLLLIILLL;
    public final C1149290g0t LLLLIL;

    @Override // X.AbstractC1126560fQE
    public final void u6() {
    }

    public final void C6() {
        C1128940fU4 c1128940fU4;
        C1128940fU4 c1128940fU42;
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI = this.LLJJLIIIJLLLLLLLZ;
        Object obj = abstractC1126600fQI != null ? abstractC1126600fQI.LIZIZ : null;
        if (!(obj instanceof C1128940fU4) || (c1128940fU4 = (C1128940fU4) obj) == null || c1128940fU4.LJIIJ != 100) {
            C500260Jjc.LJIILIIL(this.LLLLIIIILLL);
            return;
        }
        Object obj2 = abstractC1126600fQI != null ? abstractC1126600fQI.LIZIZ : null;
        Gift.GiftSponsorInfo giftSponsorInfoLIZJ = C1127480fRi.LIZJ((!(obj2 instanceof C1128940fU4) || (c1128940fU42 = (C1128940fU4) obj2) == null) ? null : Long.valueOf(c1128940fU42.LJIIJJI), null);
        AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 = this.LLJJLIIIJLLLLLLLZ;
        if (abstractC1126600fQI2 != null && !abstractC1126600fQI2.LIZJ) {
            if ((giftSponsorInfoLIZJ != null ? giftSponsorInfoLIZJ.sponsorId : 0L) == UserService.getInstance().user().getCurrentUserId() && C1125800fP0.LJI()) {
                C500260Jjc.LLFFF(this.LLLLIIIILLL);
                C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(UserService.getInstance().user().getCurrentUser().getAvatarThumb());
                c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
                float fLIZIZ = C497740JfY.LIZIZ(0.8f);
                c1324610kZfLJIIIZ.LJJIIJ = -3421237;
                c1324610kZfLJIIIZ.LJJIII = fLIZIZ;
                c1324610kZfLJIIIZ.LJIIIZ = R.drawable.ela;
                c1324610kZfLJIIIZ.LJJI(this.LLLLIIIILLL);
                return;
            }
        }
        C500260Jjc.LJIILIIL(this.LLLLIIIILLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000f  */
    @Override // X.AbstractC1126560fQE
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v6() {
        /*
            r5 = this;
            X.0fQI<? extends X.0054> r2 = r5.LLJJLIIIJLLLLLLLZ
            r0 = 0
            if (r2 == 0) goto Lf
            com.bytedance.android.live.base.model.ImageModel r1 = r2.LJ
            if (r1 == 0) goto La
            return
        La:
            if (r2 == 0) goto Lf
            T extends X.0054 r4 = r2.LIZIZ
            goto L10
        Lf:
            r4 = r0
        L10:
            boolean r1 = r4 instanceof X.C1128940fU4
            if (r1 == 0) goto L41
            X.0fU4 r4 = (X.C1128940fU4) r4
            if (r4 == 0) goto L42
            com.bytedance.android.live.base.model.ImageModel r3 = r4.LJII
        L1a:
            if (r2 == 0) goto L2b
            boolean r2 = r2.LJIILJJIL()
            r1 = 1
            if (r2 != r1) goto L2b
            if (r3 == 0) goto L2a
            r0 = 0
            r5.c6(r0, r3)
        L2a:
            return
        L2b:
            if (r4 == 0) goto L2f
            com.bytedance.android.live.base.model.ImageModel r0 = r4.LJIIIIZZ
        L2f:
            X.0fQI<? extends X.0054> r2 = r5.LLJJLIIIJLLLLLLLZ
            if (r2 == 0) goto L3b
            com.bytedance.android.live.base.model.ImageModel r1 = r2.LJFF
            if (r1 == 0) goto L3b
            if (r2 == 0) goto L2a
            com.bytedance.android.live.base.model.ImageModel r0 = r2.LJFF
        L3b:
            if (r0 == 0) goto L2a
            r5.b6(r0)
            return
        L41:
            r4 = r0
        L42:
            r3 = r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1126970fQt.v6():void");
    }

    @Override // X.AbstractC1126560fQE
    public final void e6() {
        super.e6();
        C6();
    }

    @Override // X.AbstractC1126560fQE
    public final String R5() {
        return this.LLLILZLLLI;
    }

    public final void z6(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI) {
        C1128940fU4 c1128940fU4;
        int comboCount;
        long id;
        T t = abstractC1126600fQI.LIZIZ;
        if (!(t instanceof C1128940fU4) || (c1128940fU4 = (C1128940fU4) t) == null || !c1128940fU4.LJIILLIIL) {
            return;
        }
        C1126220fPg c1126220fPg = this.LLLJL;
        int comboCount2 = 1;
        if (c1126220fPg == null || c1126220fPg.getVisibility() != 0) {
            this.LLLLIIL = (int) c1128940fU4.LIZIZ;
        }
        C1126220fPg c1126220fPg2 = this.LLLJL;
        if (c1126220fPg2 != null) {
            comboCount = c1126220fPg2.getComboCount();
        } else {
            comboCount = 0;
        }
        if (comboCount < this.LLLLIIL) {
            int i = c1128940fU4.LJIJJ;
            C500260Jjc.LLFFF(this.LLLJL);
            C500260Jjc.LJIILLIIL(this.LLLLII);
            C1126220fPg c1126220fPg3 = this.LLLJL;
            if (c1126220fPg3 != null) {
                long j = c1128940fU4.LJIIJJI;
                User userLIZJ = C1125800fP0.LIZJ();
                if (userLIZJ != null) {
                    id = userLIZJ.getId();
                } else {
                    id = 0;
                }
                C1125500fOW.LIZJ(c1126220fPg3, j, id, new AwS59S0301000_17(this, (C1126970fQt) c1128940fU4, (C1128940fU4) i, (int) abstractC1126600fQI, (AbstractC1126600fQI<? extends AnonymousClass0054>) 1), new AwS561S0100000_17(this, 327), false);
            }
            C1126220fPg c1126220fPg4 = this.LLLJL;
            if (c1126220fPg4 != null) {
                comboCount2 = c1126220fPg4.getComboCount();
            }
            c1128940fU4.LJIJI = comboCount2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1126970fQt(View view, List<? extends AbstractC1126600fQI<? extends AnonymousClass0054>> list) {
        super(view);
        this.LLLILZ = view;
        this.LLLILZJ = list;
        this.LLLILZLLLI = "LiveBagItemViewHolder";
        this.LLLLIILLL = -1;
        this.LLLLIL = new C1149290g0t(new AwS561S0100000_17(this, 328), AFwS205S0000000_17.get$arr$(142), AFwS205S0000000_17.get$arr$(143), AFwS205S0000000_17.get$arr$(144));
        this.LLLIZZ = (C16F5) view.findViewById(R.id.l1r);
        this.LLLJ = (C16F5) view.findViewById(R.id.l15);
        this.LLLJIL = view.findViewById(R.id.vui);
        this.LLLJL = (C1126220fPg) view.findViewById(R.id.f678bnj);
        this.LLLL = (C16F5) view.findViewById(R.id.bp5);
        this.LLLLII = view.findViewById(R.id.yo_);
        this.LLLLIIIILLL = (C1324720kZq) view.findViewById(R.id.j0l);
    }

    @Override // X.AbstractC1126560fQE
    public final void L5(int i, C1149290g0t c1149290g0t) {
        this.LLLLIILLL = i;
        this.LLLILZ.setOnTouchListener(new ATListenerS450S0100000_17(this, 6));
    }

    @Override // X.AbstractC1126560fQE
    public final void N5(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, DataChannel dataChannel, int i) throws JSONException {
        C19ME c19me;
        int i2;
        C16F5 c16f5;
        C1128940fU4 c1128940fU4;
        Integer numValueOf;
        C1126220fPg c1126220fPg;
        C1126220fPg c1126220fPg2;
        String strLJIJI;
        C1126220fPg c1126220fPg3;
        C1126980fQu c1126980fQu;
        Object next;
        long j;
        Object next2;
        long j2;
        Object next3;
        long j3;
        Object next4;
        long j4;
        Object next5;
        long j5;
        String str;
        C1128940fU4 c1128940fU42;
        C1128940fU4 c1128940fU43;
        C1128940fU4 c1128940fU44;
        C1128940fU4 c1128940fU45;
        C1128940fU4 c1128940fU46;
        C1128940fU4 c1128940fU47;
        C1128940fU4 c1128940fU48;
        C1128940fU4 c1128940fU49;
        C1128940fU4 c1128940fU410;
        C1128940fU4 c1128940fU411;
        Integer numLIZJ;
        boolean z;
        String strValueOf;
        int iLIZ;
        C19ME c19me2;
        super.N5(abstractC1126600fQI, dataChannel, i);
        this.LLLLIILL = dataChannel;
        C1125760fOw.LIZ(this.LLJJIII, this.LLJILJIL, this.LLJIJIL);
        T t = abstractC1126600fQI.LIZIZ;
        if (abstractC1126600fQI.LIZJ) {
            C16F5 c16f52 = this.LLLIZZ;
            if (c16f52 != null) {
                ViewGroup.LayoutParams layoutParams = c16f52.getLayoutParams();
                if ((layoutParams instanceof C19ME) && (c19me2 = (C19ME) layoutParams) != null) {
                    c19me2.topToBottom = R.id.iwx;
                } else {
                    c19me2 = null;
                }
                C786410Ut5.y6(c16f52, c19me2);
            }
        } else {
            C16F5 c16f53 = this.LLLIZZ;
            if (c16f53 != null) {
                ViewGroup.LayoutParams layoutParams2 = c16f53.getLayoutParams();
                if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
                    c19me.topToBottom = R.id.p6q;
                } else {
                    c19me = null;
                }
                C786410Ut5.y6(c16f53, c19me);
            }
        }
        boolean z2 = t instanceof C1128940fU4;
        if (z2) {
            C1128940fU4 c1128940fU412 = (C1128940fU4) t;
            c1128940fU412.LJJ = false;
            C16F5 c16f54 = this.LLLJ;
            if (c16f54 != null) {
                long j6 = c1128940fU412.LIZIZ;
                int i3 = c1128940fU412.LJIIJ;
                AwS631S0100000_17 awS631S0100000_17 = new AwS631S0100000_17(c16f54, 26);
                if (i3 != 101 && i3 != 10) {
                    z = false;
                } else {
                    z = true;
                }
                if (j6 < 100) {
                    strValueOf = String.valueOf(j6);
                } else if (z) {
                    if (j6 <= 999) {
                        strValueOf = String.valueOf(j6);
                    } else {
                        strValueOf = "999+";
                    }
                } else {
                    strValueOf = "99+";
                }
                if (j6 < 100) {
                    iLIZ = C439101nJ.LIZ(13);
                } else if (!z || j6 <= 999) {
                    iLIZ = C439101nJ.LIZ(18);
                } else {
                    iLIZ = C439101nJ.LIZ(23);
                }
                awS631S0100000_17.invoke(strValueOf, Integer.valueOf(iLIZ));
            }
            C16F5 c16f55 = this.LLLIZZ;
            if (c16f55 != null) {
                c16f55.setText(c1128940fU412.LJFF);
            }
            if (!c1128940fU412.LJIIL) {
                C16F5 c16f56 = this.LLJJJJ;
                if (c16f56 != null) {
                    c16f56.setBackgroundResource(R.drawable.ev7);
                }
                Context context = this.itemView.getContext();
                if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.ei, context)) != null) {
                    int iIntValue = numLIZJ.intValue();
                    C16F5 c16f57 = this.LLJJJJ;
                    if (c16f57 != null) {
                        c16f57.setTextColor(iIntValue);
                    }
                }
                this.LLJLL = true;
                if ((!this.LLLILZJ.isEmpty()) && i == this.LLLILZJ.size() - 1) {
                    List<AbstractC1126600fQI<? extends AnonymousClass0054>> list = this.LLLILZJ;
                    if (C1128860fTw.LIZ != 0) {
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                        for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI2 : list) {
                            if (!(abstractC1126600fQI2 instanceof C1126980fQu)) {
                                abstractC1126600fQI2 = null;
                            }
                            arrayList.add(abstractC1126600fQI2);
                        }
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next = it2.next();
                                AbstractC1126600fQI abstractC1126600fQI3 = (AbstractC1126600fQI) next;
                                if (abstractC1126600fQI3 != null && (c1128940fU411 = (C1128940fU4) abstractC1126600fQI3.LIZIZ) != null && c1128940fU411.LJIIL && c1128940fU411.LJIIJ == 1) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        AbstractC1126600fQI abstractC1126600fQI4 = (AbstractC1126600fQI) next;
                        if (abstractC1126600fQI4 != null && (c1128940fU410 = (C1128940fU4) abstractC1126600fQI4.LIZIZ) != null) {
                            j = c1128940fU410.LIZIZ;
                        } else {
                            j = 0;
                        }
                        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                        for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI5 : list) {
                            if (!(abstractC1126600fQI5 instanceof C1126980fQu)) {
                                abstractC1126600fQI5 = null;
                            }
                            arrayList2.add(abstractC1126600fQI5);
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next2 = it3.next();
                                AbstractC1126600fQI abstractC1126600fQI6 = (AbstractC1126600fQI) next2;
                                if (abstractC1126600fQI6 != null && (c1128940fU49 = (C1128940fU4) abstractC1126600fQI6.LIZIZ) != null && c1128940fU49.LJIIL && c1128940fU49.LJIIJ == 2) {
                                    break;
                                }
                            } else {
                                next2 = null;
                                break;
                            }
                        }
                        AbstractC1126600fQI abstractC1126600fQI7 = (AbstractC1126600fQI) next2;
                        if (abstractC1126600fQI7 != null && (c1128940fU48 = (C1128940fU4) abstractC1126600fQI7.LIZIZ) != null) {
                            j2 = c1128940fU48.LIZIZ;
                        } else {
                            j2 = 0;
                        }
                        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
                        for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI8 : list) {
                            if (!(abstractC1126600fQI8 instanceof C1126980fQu)) {
                                abstractC1126600fQI8 = null;
                            }
                            arrayList3.add(abstractC1126600fQI8);
                        }
                        Iterator it4 = arrayList3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                next3 = it4.next();
                                AbstractC1126600fQI abstractC1126600fQI9 = (AbstractC1126600fQI) next3;
                                if (abstractC1126600fQI9 != null && (c1128940fU47 = (C1128940fU4) abstractC1126600fQI9.LIZIZ) != null && c1128940fU47.LJIIL && c1128940fU47.LJIIJ == 3) {
                                    break;
                                }
                            } else {
                                next3 = null;
                                break;
                            }
                        }
                        AbstractC1126600fQI abstractC1126600fQI10 = (AbstractC1126600fQI) next3;
                        if (abstractC1126600fQI10 != null && (c1128940fU46 = (C1128940fU4) abstractC1126600fQI10.LIZIZ) != null) {
                            j3 = c1128940fU46.LIZIZ;
                        } else {
                            j3 = 0;
                        }
                        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(list, 10));
                        for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI11 : list) {
                            if (!(abstractC1126600fQI11 instanceof C1126980fQu)) {
                                abstractC1126600fQI11 = null;
                            }
                            arrayList4.add(abstractC1126600fQI11);
                        }
                        Iterator it5 = arrayList4.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                next4 = it5.next();
                                AbstractC1126600fQI abstractC1126600fQI12 = (AbstractC1126600fQI) next4;
                                if (abstractC1126600fQI12 != null && (c1128940fU45 = (C1128940fU4) abstractC1126600fQI12.LIZIZ) != null && c1128940fU45.LJIIL && c1128940fU45.LJIIJ == 4) {
                                    break;
                                }
                            } else {
                                next4 = null;
                                break;
                            }
                        }
                        AbstractC1126600fQI abstractC1126600fQI13 = (AbstractC1126600fQI) next4;
                        if (abstractC1126600fQI13 != null && (c1128940fU44 = (C1128940fU4) abstractC1126600fQI13.LIZIZ) != null) {
                            j4 = c1128940fU44.LIZIZ;
                        } else {
                            j4 = 0;
                        }
                        ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(list, 10));
                        for (AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI14 : list) {
                            if (!(abstractC1126600fQI14 instanceof C1126980fQu)) {
                                abstractC1126600fQI14 = null;
                            }
                            arrayList5.add(abstractC1126600fQI14);
                        }
                        Iterator it6 = arrayList5.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                next5 = it6.next();
                                AbstractC1126600fQI abstractC1126600fQI15 = (AbstractC1126600fQI) next5;
                                if (abstractC1126600fQI15 != null && (c1128940fU43 = (C1128940fU4) abstractC1126600fQI15.LIZIZ) != null && c1128940fU43.LJIIL && c1128940fU43.LJIIJ == 9) {
                                    break;
                                }
                            } else {
                                next5 = null;
                                break;
                            }
                        }
                        AbstractC1126600fQI abstractC1126600fQI16 = (AbstractC1126600fQI) next5;
                        if (abstractC1126600fQI16 != null && (c1128940fU42 = (C1128940fU4) abstractC1126600fQI16.LIZIZ) != null) {
                            j5 = c1128940fU42.LIZIZ;
                        } else {
                            j5 = 0;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", System.currentTimeMillis() - C1128860fTw.LIZ);
                        C1128860fTw.LIZ = 0L;
                        jSONObject.put("available_boosting_gloves_count", j);
                        jSONObject.put("available_magic_smokes_count", j2);
                        jSONObject.put("available_time_extending_count", j3);
                        jSONObject.put("available_hammer_count", j4);
                        jSONObject.put("available_vault_gloves_count", j5);
                        if (j + j2 + j3 + j4 > 0) {
                            str = "1";
                        } else {
                            str = CardStruct.IStatusCode.DEFAULT;
                        }
                        jSONObject.put("is_available", str);
                        C1128860fTw.LJIIIIZZ("match_item_backpack_show", new JSONObject(), jSONObject, false, "");
                    }
                }
            }
        }
        if ((abstractC1126600fQI instanceof C1126980fQu) && (c1126980fQu = (C1126980fQu) abstractC1126600fQI) != null) {
            c1126980fQu.LJJI = new AwS561S0100000_17(this, 326);
        }
        if (z2 && (c1128940fU4 = (C1128940fU4) t) != null && (numValueOf = Integer.valueOf(c1128940fU4.LJIIJ)) != null) {
            if (numValueOf.intValue() == 100) {
                C1128940fU4 c1128940fU413 = (C1128940fU4) t;
                if (!c1128940fU413.LJIIL && c1128940fU413.LJIL > 0) {
                    strLJIJI = C497740JfY.LJIJI(2131850994);
                } else {
                    strLJIJI = c1128940fU413.LJFF;
                }
                C16F5 c16f58 = this.LLLIZZ;
                if (c16f58 != null) {
                    c16f58.setText(strLJIJI);
                }
                C16F5 c16f59 = this.LLLL;
                if (c16f59 != null) {
                    c16f59.setText(strLJIJI);
                }
                C6();
                if (abstractC1126600fQI.LIZJ) {
                    C16F5 c16f510 = this.LLLL;
                    if (c16f510 != null) {
                        C500260Jjc.LLFFF(c16f510);
                    }
                    C500260Jjc.LJIILLIIL(this.LLLIZZ);
                } else {
                    C16F5 c16f511 = this.LLLL;
                    if (c16f511 != null) {
                        C500260Jjc.LJIILLIIL(c16f511);
                    }
                    C500260Jjc.LLFFF(this.LLLIZZ);
                }
                if (c1128940fU413.LJIIL) {
                    if (abstractC1126600fQI.LIZLLL && ((c1126220fPg3 = this.LLLJL) == null || c1126220fPg3.getVisibility() != 0)) {
                        abstractC1126600fQI.LIZLLL = false;
                        c1128940fU413.LJIJJ++;
                        if (!c1128940fU413.LJIJJLI) {
                            z6(abstractC1126600fQI);
                        }
                    }
                } else {
                    C500260Jjc.LJIILLIIL(this.LLLJL);
                    C500260Jjc.LLFFF(this.LLLLII);
                }
            } else if (numValueOf != null) {
                if (numValueOf.intValue() != 4 && numValueOf.intValue() != 3 && numValueOf.intValue() != 1 && numValueOf.intValue() != 2 && numValueOf.intValue() != 7 && numValueOf.intValue() != 8 && numValueOf.intValue() != 9) {
                    if (numValueOf.intValue() == 101 || numValueOf.intValue() == 10) {
                        C16F5 c16f512 = this.LLLL;
                        if (c16f512 != null) {
                            C500260Jjc.LJIILIIL(c16f512);
                        }
                        C16F5 c16f513 = this.LLLIZZ;
                        if (c16f513 != null) {
                            C500260Jjc.LLFFF(c16f513);
                        }
                        C1128940fU4 c1128940fU414 = (C1128940fU4) t;
                        if (c1128940fU414.LJIIL) {
                            if (c1128940fU414.LJIIJ == 10 && c1128940fU414.LJIJJLI && (c1126220fPg2 = this.LLLJL) != null && c1126220fPg2.getVisibility() == 0) {
                                c1128940fU414.LJIJJ++;
                                C1126220fPg c1126220fPg4 = this.LLLJL;
                                if (c1126220fPg4 != null) {
                                    C500260Jjc.LJIILLIIL(c1126220fPg4);
                                }
                                C1126220fPg c1126220fPg5 = this.LLLJL;
                                if (c1126220fPg5 != null) {
                                    c1126220fPg5.LJFF();
                                }
                                C500260Jjc.LLFFF(this.LLLLII);
                            }
                            if (abstractC1126600fQI.LIZLLL && ((c1126220fPg = this.LLLJL) == null || c1126220fPg.getVisibility() != 0)) {
                                abstractC1126600fQI.LIZLLL = false;
                                c1128940fU414.LJIJJ++;
                                if (!c1128940fU414.LJIJJLI) {
                                    z6(abstractC1126600fQI);
                                }
                            }
                        } else {
                            C500260Jjc.LJIILLIIL(this.LLLJL);
                            C500260Jjc.LLFFF(this.LLLLII);
                        }
                    }
                } else {
                    C16F5 c16f514 = this.LLLL;
                    if (c16f514 != null) {
                        C500260Jjc.LJIILLIIL(c16f514);
                    }
                    C1126220fPg c1126220fPg6 = this.LLLJL;
                    if (c1126220fPg6 != null) {
                        C500260Jjc.LJIILLIIL(c1126220fPg6);
                    }
                    C500260Jjc.LLFFF(this.LLLLII);
                    C16F5 c16f515 = this.LLLIZZ;
                    if (c16f515 != null) {
                        C500260Jjc.LLFFF(c16f515);
                    }
                    C1128940fU4 c1128940fU415 = (C1128940fU4) t;
                    if (c1128940fU415.LJIIL) {
                        if (c1128940fU415.LJIILJJIL) {
                            View view = this.LLLJIL;
                            if (view != null) {
                                C786410Ut5.LJLLLLLL(0, view);
                            }
                            C16F5 c16f516 = this.LLJJJJ;
                            if (c16f516 != null) {
                                c16f516.setText("");
                            }
                            this.LLJLL = true;
                        } else {
                            View view2 = this.LLLJIL;
                            if (view2 != null) {
                                C786410Ut5.LJLLLLLL(8, view2);
                            }
                            C16F5 c16f517 = this.LLJJJJ;
                            if (c16f517 != null) {
                                c16f517.setText(C497740JfY.LJIJI(2131844052));
                            }
                            i2 = 0;
                            this.LLJLL = false;
                        }
                    }
                }
            }
            i2 = 0;
        } else {
            i2 = 0;
        }
        if (C500260Jjc.LJJJIL(dataChannel) && (c16f5 = this.LLJJJJ) != null) {
            C786410Ut5.LLJJJJ(c16f5, i2);
        }
    }
}
