package X;

import Y.AfS113S0300000_21;
import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1392890mLn {
    public static final C1392890mLn LIZ = new C1392890mLn();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1392910mLp());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1392900mLo());

    public static CopyOnWriteArrayList LIZ() {
        return (CopyOnWriteArrayList) LIZIZ.getValue();
    }

    public static void LIZLLL(InterfaceC1392880mLm interfaceC1392880mLm) {
        if (interfaceC1392880mLm == null) {
            return;
        }
        Iterator it2 = LIZ().iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(((SoftReference) it2.next()).get(), interfaceC1392880mLm)) {
                return;
            }
        }
        LIZ().add(new SoftReference(interfaceC1392880mLm));
    }

    public static void LJII(InterfaceC1392880mLm interfaceC1392880mLm) {
        if (interfaceC1392880mLm == null) {
            return;
        }
        for (SoftReference softReference : LIZ()) {
            if (Intrinsics.LJFF(softReference.get(), interfaceC1392880mLm)) {
                LIZ().remove(softReference);
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1323605Fy
            if (r0 == 0) goto L4d
            r6 = r8
            X.05Fy r6 = (X.C1323605Fy) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4d
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r1 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r5 = 1
            if (r0 == 0) goto L32
            if (r0 != r5) goto L53
            X.00w2 r3 = r6.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            long r3 = r3.element
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L2d
            r5 = 0
        L2d:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            return r0
        L32:
            X.C155000ia.LIZIZ(r1)
            X.00w2 r3 = new X.00w2
            r3.<init>()
            X.1DFB r2 = X.C0PEM.LIZJ
            X.05Fx r1 = new X.05Fx
            r0 = 0
            r1.<init>(r3, r0)
            r6.LL = r3
            r6.LLILZ = r5
            java.lang.Object r0 = X.C23250099c.LJI(r6, r2, r1)
            if (r0 != r4) goto L24
            return r4
        L4d:
            X.05Fy r6 = new X.05Fy
            r6.<init>(r7, r8)
            goto L12
        L53:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1392890mLn.LIZIZ(X.05Vn):java.lang.Object");
    }

    public static void LJFF(Activity activity, Fragment fragment) {
        C1389890mGx c1389890mGx;
        if (activity != null) {
            c1389890mGx = new C1389890mGx(activity);
        } else if (fragment == null) {
            return;
        } else {
            c1389890mGx = new C1389890mGx(fragment);
        }
        c1389890mGx.LJIIIZ(2131837843);
        c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
        c1389890mGx.LJII(R.attr.ee);
        c1389890mGx.LJIIJJI();
    }

    public static void LJ(EnumC1392960mLu enumC1392960mLu, String str, boolean z) {
        Map map = (Map) LIZJ.getValue();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        Object linkedHashMap = map.get(curUserId);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            map.put(curUserId, linkedHashMap);
        }
        Map map2 = (Map) linkedHashMap;
        Object linkedHashMap2 = map2.get(str);
        if (linkedHashMap2 == null) {
            linkedHashMap2 = new LinkedHashMap();
            map2.put(str, linkedHashMap2);
        }
        Map map3 = (Map) linkedHashMap2;
        map3.put(enumC1392960mLu, Boolean.valueOf(z));
        if (enumC1392960mLu == EnumC1392960mLu.ALL) {
            C1610870s1N.LIZ.getClass();
            if (C1610870s1N.LIZLLL()) {
                map3.put(EnumC1392960mLu.STORIES, Boolean.valueOf(z));
                map3.put(EnumC1392960mLu.POSTS, Boolean.valueOf(z));
                if (C1610870s1N.LIZIZ()) {
                    map3.put(EnumC1392960mLu.LIVES, Boolean.valueOf(z));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r11v1, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r11v2, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r11v3, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r11v4, types: [android.content.Context] */
    public static void LJI(Fragment fragment, Activity activity, User user, EnumC1392960mLu enumC1392960mLu, boolean z, View view) {
        C1389890mGx c1389890mGx;
        int i;
        C1389880mGw c1389880mGw;
        int i2;
        String string = null;
        if (C299060Bns.LIZ()) {
            if (view != null) {
                c1389880mGw = new C1389880mGw(view);
            } else if (activity != 0) {
                c1389880mGw = new C1389880mGw((Activity) activity);
            } else if (fragment == null) {
                return;
            } else {
                c1389880mGw = new C1389880mGw(fragment);
            }
            C1243240iSQ.LIZ.getClass();
            String nickname = user.getNickname();
            if (nickname == null) {
                nickname = "";
            }
            String strLIZ = C0SE9.LIZ(user, nickname);
            C1610870s1N.LIZ.getClass();
            if (C1610870s1N.LIZLLL()) {
                int i3 = C1392920mLq.LIZ[enumC1392960mLu.ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                if (z) {
                                    i2 = 2131848321;
                                } else {
                                    i2 = 2131848326;
                                }
                            } else {
                                throw new C1954807lC();
                            }
                        } else if (z) {
                            i2 = 2131848317;
                        } else {
                            i2 = 2131848322;
                        }
                    } else if (z) {
                        i2 = 2131848318;
                    } else {
                        i2 = 2131848323;
                    }
                } else if (z) {
                    i2 = 2131848320;
                } else {
                    i2 = 2131848325;
                }
            } else if (z) {
                i2 = 2131848319;
            } else {
                i2 = 2131848324;
            }
            if (activity != 0 || (fragment != null && (activity = fragment.getContext()) != 0)) {
                string = activity.getString(i2, strLIZ);
            }
            c1389880mGw.LJIIIZ(string);
            c1389880mGw.LJIIJ();
            return;
        }
        if (view != null) {
            c1389890mGx = new C1389890mGx(view);
        } else if (activity != 0) {
            c1389890mGx = new C1389890mGx((Activity) activity);
        } else if (fragment == null) {
            return;
        } else {
            c1389890mGx = new C1389890mGx(fragment);
        }
        C1243240iSQ.LIZ.getClass();
        String nickname2 = user.getNickname();
        if (nickname2 == null) {
            nickname2 = "";
        }
        String strLIZ2 = C0SE9.LIZ(user, nickname2);
        C1610870s1N.LIZ.getClass();
        if (C1610870s1N.LIZLLL()) {
            int i4 = C1392920mLq.LIZ[enumC1392960mLu.ordinal()];
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 == 4) {
                            if (z) {
                                i = 2131848321;
                            } else {
                                i = 2131848326;
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else if (z) {
                        i = 2131848317;
                    } else {
                        i = 2131848322;
                    }
                } else if (z) {
                    i = 2131848318;
                } else {
                    i = 2131848323;
                }
            } else if (z) {
                i = 2131848320;
            } else {
                i = 2131848325;
            }
        } else if (z) {
            i = 2131848319;
        } else {
            i = 2131848324;
        }
        if (activity != 0 || (fragment != null && (activity = fragment.getContext()) != 0)) {
            string = activity.getString(i, strLIZ2);
        }
        c1389890mGx.LJIIJ(string);
        c1389890mGx.LJIIJJI();
    }

    public static void LIZJ(final User user, final Fragment fragment, final Activity activity, EnumC1393020mM0 enumC1393020mM0, final EnumC1392960mLu enumC1392960mLu, final View view, final Function1 function1) {
        if (user.getUid() == null) {
            function1.invoke(Boolean.FALSE);
        } else {
            LJ(enumC1392960mLu, user.getUid(), false);
            C11NZ.LJIJJLI(new C1402330mb1(user, enumC1393020mM0, enumC1392960mLu, 0)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJZ(new C09JN() { // from class: X.0mLk
                /* JADX WARN: Removed duplicated region for block: B:51:0x00fa  */
                @Override // X.C09JN
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void accept(java.lang.Object r14) {
                    /*
                        Method dump skipped, instruction units count: 387
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1392860mLk.accept(java.lang.Object):void");
                }
            }, new AfS113S0300000_21(function1, fragment, activity, 6), new C1402170mal(function1, fragment, activity, 0));
        }
    }
}
