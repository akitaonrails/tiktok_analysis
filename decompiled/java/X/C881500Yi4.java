package X;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VOLightInteractionEntryConf;
import com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VORightOperationType;
import com.ss.android.ugc.aweme.im.chatlist.api.model.LastMessageProperty;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.common.model.RelationshipCelebrationTarget;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.service.IDmHelper;
import com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomService;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0Yi4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C881500Yi4 {
    public static boolean LIZJ() {
        if (C19212010Ec.LIZJ.LIZLLL()) {
            return C293380Bei.LIZ() == 1 || C293380Bei.LIZ() == 4;
        }
        return false;
    }

    public static C878950Ydx LIZLLL() {
        Pair<FilterTabType, Set<EnumC880480YgQ>> pairLJLIIIL = C19212010Ec.LIZJ.LJLIIIL();
        FilterTabType first = pairLJLIIIL.getFirst();
        Set<EnumC880480YgQ> second = pairLJLIIIL.getSecond();
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        return new C878950Ydx(null, first, second, AbstractC883730Ylf.LJIIJJI.getValue().longValue(), 19);
    }

    public static AbstractC883730Ylf LJ() {
        return C1492205sm.LIZ[C19212010Ec.LIZJ.LIZJ().ordinal()] == 1 ? AbstractC883730Ylf.LJIIIZ.getValue() : AbstractC883730Ylf.LJIIJ.getValue();
    }

    public static boolean LJII() {
        return C19212010Ec.LIZJ.LIZJ() == C05RV.PERSONAL_INBOX && (C300740Bqa.LIZ() & 65536) != 0;
    }

    public static InterfaceC884250YmV LIZ(C13IQ c13iq) {
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C878460YdA.class))) {
            return new C878460YdA();
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C878840Ydm.class))) {
            return new C878840Ydm();
        }
        return null;
    }

    public static InterfaceC882190YjB LIZIZ(C13IQ c13iq) {
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C879870YfR.class))) {
            return new InterfaceC882190YjB() { // from class: X.0YfR
                public final C1491005sa LIZ = C1491005sa.LIZ;
                public final String LIZIZ = "ChatListIntermediateInfoDecorator";
                public final String LIZJ = "intermediate_info_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C879880YfS());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC882190YjB
                public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
                    C0Y8T c0y8t;
                    C886900Yqm c886900Yqm = C886900Yqm.LIZ;
                    T t = 0;
                    if (!Intrinsics.LJFF(abstractC886530YqB, c886900Yqm) || !(c879540Yeu.LIZ instanceof InterfaceC1606206Qq)) {
                        return null;
                    }
                    T t2 = c879540Yeu.LIZJ;
                    if (t2 instanceof C0Y8T) {
                        c0y8t = (C0Y8T) t2;
                    } else {
                        c0y8t = null;
                    }
                    LastMessageProperty lastMessagePropertyLIZ = ((IDmHelper) ServiceManager.get().getService(IDmHelper.class)).LIZ(c0y8t);
                    if (lastMessagePropertyLIZ == null) {
                        return null;
                    }
                    if (c882270YjJ == null) {
                        return new C882270YjJ<>(c886900Yqm, new C879860YfQ(lastMessagePropertyLIZ));
                    }
                    C879860YfQ c879860YfQ = (C879860YfQ) c882270YjJ.LIZIZ;
                    if (c879860YfQ != null) {
                        c879860YfQ.setLastMessageProperty(lastMessagePropertyLIZ);
                        t = c879860YfQ;
                    }
                    c882270YjJ.LIZIZ = t;
                    return c882270YjJ;
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C879980Yfc.class))) {
            return new InterfaceC882190YjB() { // from class: X.0Yfc
                public final C1491005sa LIZ = C1491005sa.LIZ;
                public final String LIZIZ = "ChatListSortOrderDecorator";
                public final String LIZJ = "sort_order_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C879990Yfd());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.Long] */
                @Override // X.InterfaceC882190YjB
                public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
                    C0Y8T c0y8t;
                    Long lValueOf;
                    C879950YfZ c879950YfZ;
                    C0Y8T c0y8t2;
                    C887290YrP c887290YrP = C887290YrP.LIZ;
                    if (!Intrinsics.LJFF(abstractC886530YqB, c887290YrP)) {
                        return null;
                    }
                    InterfaceC1490905sZ<?> interfaceC1490905sZ = c879540Yeu.LIZ;
                    if (!Intrinsics.LJFF(interfaceC1490905sZ, C1606106Qp.INSTANCE) && !Intrinsics.LJFF(interfaceC1490905sZ, C882110Yj3.INSTANCE)) {
                        if (Intrinsics.LJFF(interfaceC1490905sZ, C1606306Qr.INSTANCE)) {
                            T t = c879540Yeu.LIZJ;
                            if (t instanceof C0Y8T) {
                                c0y8t2 = (C0Y8T) t;
                            } else {
                                c0y8t2 = null;
                            }
                            if (C880000Yfe.LIZ) {
                                if (c0y8t2 == null) {
                                    return null;
                                }
                                lValueOf = Long.valueOf(c0y8t2.getSortOrder() % ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                            } else {
                                if (c0y8t2 == null) {
                                    return null;
                                }
                                lValueOf = Long.valueOf(c0y8t2.getSortOrder());
                            }
                        } else {
                            if (!Intrinsics.LJFF(interfaceC1490905sZ, C878910Ydt.INSTANCE)) {
                                return null;
                            }
                            T t2 = c879540Yeu.LIZJ;
                            if (!(t2 instanceof C879950YfZ) || (c879950YfZ = (C879950YfZ) t2) == null) {
                                return null;
                            }
                            lValueOf = Long.valueOf(c879950YfZ.LJ);
                        }
                    } else {
                        T t3 = c879540Yeu.LIZJ;
                        if (!(t3 instanceof C0Y8T) || (c0y8t = (C0Y8T) t3) == null) {
                            return null;
                        }
                        lValueOf = Long.valueOf(c0y8t.getSortOrder());
                    }
                    if (lValueOf == null) {
                        return null;
                    }
                    long jLongValue = lValueOf.longValue();
                    if (c882270YjJ == null) {
                        return new C882270YjJ<>(c887290YrP, Long.valueOf(jLongValue));
                    }
                    c882270YjJ.LIZIZ = Long.valueOf(jLongValue);
                    return c882270YjJ;
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C882150Yj7.class))) {
            return new InterfaceC882190YjB() { // from class: X.0Yj7
                public final C1491005sa LIZ = C1491005sa.LIZ;
                public final String LIZIZ = "ChatListAvatarDecorator";
                public final String LIZJ = "avatar_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C882160Yj8());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v20, types: [T, X.0YjG] */
                /* JADX WARN: Type inference failed for: r0v7, types: [T, X.0Yq1] */
                /* JADX WARN: Type inference failed for: r1v8, types: [T, X.0YjE] */
                @Override // X.InterfaceC882190YjB
                public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
                    Object obj;
                    BaseContact baseContact;
                    UrlModel displayAvatar;
                    C0Y8T c0y8t;
                    C887300YrQ c887300YrQ = C887300YrQ.LIZ;
                    if (!Intrinsics.LJFF(abstractC886530YqB, c887300YrQ)) {
                        return null;
                    }
                    InterfaceC1490905sZ<?> interfaceC1490905sZ = c879540Yeu.LIZ;
                    if (!Intrinsics.LJFF(interfaceC1490905sZ, C1606106Qp.INSTANCE) && !Intrinsics.LJFF(interfaceC1490905sZ, C882110Yj3.INSTANCE)) {
                        if (Intrinsics.LJFF(interfaceC1490905sZ, C1606306Qr.INSTANCE)) {
                            T t = c879540Yeu.LIZJ;
                            if (t instanceof C0Y8T) {
                                c0y8t = (C0Y8T) t;
                            } else {
                                c0y8t = null;
                            }
                            String strLJIILLIIL = C0ZFW.LIZ.LJIILLIIL(c0y8t);
                            if (strLJIILLIIL == null) {
                                return null;
                            }
                            if (c882270YjJ == null) {
                                return new C882270YjJ<>(c887300YrQ, new C882240YjG(strLJIILLIIL));
                            }
                            c882270YjJ.LIZIZ = new C882240YjG(strLJIILLIIL);
                            return c882270YjJ;
                        }
                        if (!Intrinsics.LJFF(interfaceC1490905sZ, C878910Ydt.INSTANCE)) {
                            return null;
                        }
                        if (c882270YjJ == null) {
                            c882270YjJ = null;
                        }
                        if (c882270YjJ != null) {
                            c882270YjJ.LIZIZ = new C882220YjE(Integer.valueOf(R.drawable.c32));
                            return c882270YjJ;
                        }
                        return new C882270YjJ<>(c887300YrQ, new C882220YjE(Integer.valueOf(R.drawable.c32)));
                    }
                    C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C1491505sf.LIZ);
                    if (c1490405sU != null) {
                        obj = c1490405sU.LIZIZ;
                    } else {
                        obj = null;
                    }
                    if (!(obj instanceof IMUser) || (baseContact = (BaseContact) obj) == null || (displayAvatar = baseContact.getDisplayAvatar()) == null) {
                        return null;
                    }
                    if (c882270YjJ == null) {
                        return new C882270YjJ<>(c887300YrQ, new C886430Yq1(displayAvatar));
                    }
                    c882270YjJ.LIZIZ = new C886430Yq1(displayAvatar);
                    return c882270YjJ;
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C887530Yrn.class))) {
            return new InterfaceC882190YjB() { // from class: X.0Yrn
                public final C1491005sa LIZ = C1491005sa.LIZ;
                public final String LIZIZ = "ChatListCameraStatusDecorator";
                public final String LIZJ = "camera_status_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C887370YrX());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:102:0x0169  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x0179  */
                /* JADX WARN: Removed duplicated region for block: B:109:0x017d  */
                /* JADX WARN: Removed duplicated region for block: B:116:0x0193 A[PHI: r12
                  0x0193: PHI (r12v2 boolean) = (r12v0 boolean), (r12v4 boolean) binds: [B:115:0x018f, B:30:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:118:0x019c  */
                /* JADX WARN: Removed duplicated region for block: B:126:0x01b4  */
                /* JADX WARN: Removed duplicated region for block: B:127:0x01b7  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
                /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
                /* JADX WARN: Removed duplicated region for block: B:33:0x006b A[ADDED_TO_REGION] */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x00f8  */
                @Override // X.InterfaceC882190YjB
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.C882270YjJ<?, ?> LJ(X.InterfaceC879010Ye3 r14, X.C879540Yeu<?> r15, X.AbstractC886530YqB<?, ?> r16, X.C882270YjJ<?, ?> r17) {
                    /*
                        Method dump skipped, instruction units count: 475
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C887530Yrn.LJ(X.0Ye3, X.0Yeu, X.0YqB, X.0YjJ):X.0YjJ");
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C880050Yfj.class))) {
            return new InterfaceC882190YjB() { // from class: X.0Yfj
                public final C1491005sa LIZ = C1491005sa.LIZ;
                public final String LIZIZ = "ChatListNameDecorator";
                public final String LIZJ = "name_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C880060Yfk());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
                /* JADX WARN: Type inference failed for: r0v20, types: [T, java.lang.Object, java.lang.String] */
                /* JADX WARN: Type inference failed for: r0v23, types: [T, java.lang.Object, java.lang.String] */
                @Override // X.InterfaceC882190YjB
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.C882270YjJ<?, ?> LJ(X.InterfaceC879010Ye3 r5, X.C879540Yeu<?> r6, X.AbstractC886530YqB<?, ?> r7, X.C882270YjJ<?, ?> r8) {
                    /*
                        r4 = this;
                        X.0YqU r2 = X.C886720YqU.LIZ
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r2)
                        r3 = 0
                        if (r0 == 0) goto L38
                        X.05sZ<T> r1 = r6.LIZ
                        X.06Qp r0 = X.C1606106Qp.INSTANCE
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                        if (r0 != 0) goto L60
                        X.0Yj3 r0 = X.C882110Yj3.INSTANCE
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                        if (r0 != 0) goto L60
                        X.06Qr r0 = X.C1606306Qr.INSTANCE
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                        if (r0 == 0) goto L3b
                        T r1 = r6.LIZJ
                        boolean r0 = r1 instanceof X.C0Y8T
                        if (r0 == 0) goto L39
                        X.0Y8T r1 = (X.C0Y8T) r1
                    L2b:
                        X.0ZFW r0 = X.C0ZFW.LIZ
                        java.lang.String r0 = r0.LJIIJ(r1)
                        if (r8 != 0) goto L59
                        X.0YjJ r3 = new X.0YjJ
                        r3.<init>(r2, r0)
                    L38:
                        return r3
                    L39:
                        r1 = r3
                        goto L2b
                    L3b:
                        X.0Ydt r0 = X.C878910Ydt.INSTANCE
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                        if (r0 == 0) goto L38
                        T r1 = r6.LIZJ
                        boolean r0 = r1 instanceof X.C879950YfZ
                        if (r0 == 0) goto L5f
                        X.0YfZ r1 = (X.C879950YfZ) r1
                        if (r1 == 0) goto L5f
                        java.lang.String r0 = r1.LIZIZ
                        if (r0 == 0) goto L5f
                        if (r8 != 0) goto L5c
                        X.0YjJ r3 = new X.0YjJ
                        r3.<init>(r2, r0)
                        return r3
                    L59:
                        r8.LIZIZ = r0
                        return r8
                    L5c:
                        r8.LIZIZ = r0
                        return r8
                    L5f:
                        return r3
                    L60:
                        java.util.Map<X.05sg<?>, X.05sU<?>> r1 = r6.LIZLLL
                        X.05sf r0 = X.C1491505sf.LIZ
                        java.lang.Object r0 = r1.get(r0)
                        X.05sU r0 = (X.C1490405sU) r0
                        if (r0 == 0) goto L6e
                        T r3 = r0.LIZIZ
                    L6e:
                        boolean r0 = r3 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMUser
                        if (r0 == 0) goto L82
                        com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r3 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r3
                        if (r3 == 0) goto L82
                        java.lang.String r0 = X.C1247000iYU.LIZ(r3)
                        if (r0 != 0) goto L8f
                        java.lang.String r0 = r3.getDisplayName()
                        if (r0 != 0) goto L8f
                    L82:
                        X.1Bky r0 = X.C2213981Bky.LIZIZ
                        android.content.Context r1 = r0.getApplicationContext()
                        r0 = 2131831188(0x7f112994, float:1.9295395E38)
                        java.lang.String r0 = r1.getString(r0)
                    L8f:
                        if (r8 != 0) goto L97
                        X.0YjJ r3 = new X.0YjJ
                        r3.<init>(r2, r0)
                        return r3
                    L97:
                        r8.LIZIZ = r0
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C880050Yfj.LJ(X.0Ye3, X.0Yeu, X.0YqB, X.0YjJ):X.0YjJ");
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C880730Ygp.class))) {
            return new InterfaceC882190YjB() { // from class: X.0Ygp
                public final C1491005sa LIZ = C1491005sa.LIZ;
                public final String LIZIZ = "ChatListContentDecorator";
                public final String LIZJ = "content_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C880750Ygr());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:102:0x01ed  */
                /* JADX WARN: Removed duplicated region for block: B:104:0x01fd  */
                /* JADX WARN: Removed duplicated region for block: B:120:0x0230  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
                /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x0154  */
                /* JADX WARN: Removed duplicated region for block: B:99:0x01d9  */
                @Override // X.InterfaceC882190YjB
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.C882270YjJ<?, ?> LJ(X.InterfaceC879010Ye3 r16, X.C879540Yeu<?> r17, X.AbstractC886530YqB<?, ?> r18, X.C882270YjJ<?, ?> r19) {
                    /*
                        Method dump skipped, instruction units count: 603
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C880730Ygp.LJ(X.0Ye3, X.0Yeu, X.0YqB, X.0YjJ):X.0YjJ");
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C879920YfW.class))) {
            return new InterfaceC882190YjB() { // from class: X.0YfW
                public static final /* synthetic */ int LJFF = 0;
                public final C1491005sa LIZ = C1491005sa.LIZ;
                public final String LIZIZ = "ChatListUpdateTimeDecorator";
                public final String LIZJ = "update_time_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C879930YfX());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC882190YjB
                public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
                    C879950YfZ c879950YfZ;
                    C0Y8T c0y8t;
                    Object obj;
                    C879860YfQ c879860YfQ;
                    Object obj2;
                    C879910YfV c879910YfV;
                    LastMessageProperty lastMessageProperty;
                    C887330YrT c887330YrT = C887330YrT.LIZ;
                    T t = 0;
                    T t2 = 0;
                    if (!Intrinsics.LJFF(abstractC886530YqB, c887330YrT)) {
                        return null;
                    }
                    InterfaceC1490905sZ<?> interfaceC1490905sZ = c879540Yeu.LIZ;
                    if (interfaceC1490905sZ instanceof InterfaceC1606206Qq) {
                        T t3 = c879540Yeu.LIZJ;
                        if (!(t3 instanceof C0Y8T) || (c0y8t = (C0Y8T) t3) == null) {
                            return null;
                        }
                        C882270YjJ<?, ?> c882270YjJ2 = c879540Yeu.LJ.get(C886900Yqm.LIZ);
                        if (c882270YjJ2 != null) {
                            obj = c882270YjJ2.LIZIZ;
                        } else {
                            obj = null;
                        }
                        if (obj instanceof C879860YfQ) {
                            c879860YfQ = (C879860YfQ) obj;
                        } else {
                            c879860YfQ = null;
                        }
                        C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C879960Yfa.LIZ);
                        if (c1490405sU != null) {
                            obj2 = c1490405sU.LIZIZ;
                        } else {
                            obj2 = null;
                        }
                        if (obj2 instanceof C879910YfV) {
                            c879910YfV = (C879910YfV) obj2;
                        } else {
                            c879910YfV = null;
                        }
                        if (c879860YfQ != null) {
                            lastMessageProperty = c879860YfQ.lastMessageProperty;
                        } else {
                            lastMessageProperty = null;
                        }
                        long jLIZ = C879900YfU.LIZ(c0y8t, lastMessageProperty, c879910YfV);
                        if (c882270YjJ == null) {
                            return new C882270YjJ<>(c887330YrT, new C879940YfY(String.valueOf(jLIZ), jLIZ));
                        }
                        C879940YfY c879940YfY = (C879940YfY) c882270YjJ.LIZIZ;
                        if (c879940YfY != null) {
                            c879940YfY.LIZ = String.valueOf(jLIZ);
                            c879940YfY.LIZIZ = jLIZ;
                            t2 = c879940YfY;
                        }
                        c882270YjJ.LIZIZ = t2;
                        return c882270YjJ;
                    }
                    if (!Intrinsics.LJFF(interfaceC1490905sZ, C878910Ydt.INSTANCE)) {
                        return null;
                    }
                    T t4 = c879540Yeu.LIZJ;
                    if (t4 instanceof C879950YfZ) {
                        c879950YfZ = (C879950YfZ) t4;
                    } else {
                        c879950YfZ = null;
                    }
                    if (c882270YjJ == null) {
                        c882270YjJ = null;
                    }
                    long j = 0;
                    if (c882270YjJ != null) {
                        C879940YfY c879940YfY2 = (C879940YfY) c882270YjJ.LIZIZ;
                        if (c879940YfY2 != null) {
                            c879940YfY2.LIZ = "";
                            if (c879950YfZ != null) {
                                j = c879950YfZ.LIZLLL;
                            }
                            c879940YfY2.LIZIZ = j;
                            t = c879940YfY2;
                        }
                        c882270YjJ.LIZIZ = t;
                        return c882270YjJ;
                    }
                    if (c879950YfZ != null) {
                        j = c879950YfZ.LIZLLL;
                    }
                    return new C882270YjJ<>(c887330YrT, new C879940YfY("", j));
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C881740YiS.class))) {
            return new InterfaceC882190YjB() { // from class: X.0YiS
                public final C1491005sa LIZ = C1491005sa.LIZ;
                public final String LIZIZ = "ChatListReadStatusDecorator";
                public final String LIZJ = "read_status_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C881780YiW());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:124:0x022f  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
                /* JADX WARN: Type inference failed for: r4v4, types: [T, X.0YiQ, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r4v7 */
                /* JADX WARN: Type inference failed for: r4v8 */
                @Override // X.InterfaceC882190YjB
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.C882270YjJ<?, ?> LJ(X.InterfaceC879010Ye3 r21, X.C879540Yeu<?> r22, X.AbstractC886530YqB<?, ?> r23, X.C882270YjJ<?, ?> r24) {
                    /*
                        Method dump skipped, instruction units count: 830
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C881740YiS.LJ(X.0Ye3, X.0Yeu, X.0YqB, X.0YjJ):X.0YjJ");
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C882050Yix.class))) {
            return new InterfaceC882190YjB() { // from class: X.0Yix
                public final C1517705wt LIZ = new C1517705wt(C13LQ.LJLIIL(new InterfaceC1517505wr[]{C1517305wp.LIZ, C1517405wq.LIZ}));
                public final String LIZIZ = "ChatListActivityStatusDecorator";
                public final String LIZJ = "activity_status_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C882060Yiy());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v16, types: [T, X.0Yiz, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r3v4, types: [T, X.0Yiz, java.lang.Object] */
                @Override // X.InterfaceC882190YjB
                public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
                    Object obj;
                    ?? r3;
                    C595660NXw c595660NXw;
                    Object obj2;
                    ?? r0;
                    C595660NXw c595660NXw2;
                    C0Y8T c0y8t;
                    boolean z;
                    int msgType;
                    long createdAt;
                    String string;
                    C869590Y9l lastShowMessage;
                    C886650YqN c886650YqN = C886650YqN.LIZ;
                    if (!Intrinsics.LJFF(abstractC886530YqB, c886650YqN)) {
                        return null;
                    }
                    InterfaceC1490905sZ<?> interfaceC1490905sZ = c879540Yeu.LIZ;
                    if (interfaceC1490905sZ instanceof InterfaceC1606206Qq) {
                        C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C882020Yiu.LIZ);
                        if (c1490405sU != null) {
                            obj2 = c1490405sU.LIZIZ;
                        } else {
                            obj2 = null;
                        }
                        if (!(obj2 instanceof C882070Yiz) || (r0 = (C882070Yiz) obj2) == 0 || (c595660NXw2 = r0.LIZ) == null) {
                            return null;
                        }
                        T t = c879540Yeu.LIZJ;
                        if (!(t instanceof C0Y8T) || (c0y8t = (C0Y8T) t) == null) {
                            return null;
                        }
                        int unreadCount = (int) c0y8t.getUnreadCount();
                        boolean zBooleanValue = C876830YaX.LIZ(c0y8t).getFirst().booleanValue();
                        C869590Y9l lastShowMessage2 = c0y8t.getLastShowMessage();
                        if (lastShowMessage2 == null || !C0ZDX.LJJJJIZL(lastShowMessage2) || ((lastShowMessage = c0y8t.getLastShowMessage()) != null && C0ZDX.LJJJJL(lastShowMessage))) {
                            z = false;
                        } else {
                            z = true;
                        }
                        C869590Y9l lastShowMessage3 = c0y8t.getLastShowMessage();
                        if (lastShowMessage3 != null) {
                            msgType = lastShowMessage3.getMsgType();
                        } else {
                            msgType = 0;
                        }
                        C869590Y9l lastShowMessage4 = c0y8t.getLastShowMessage();
                        if (lastShowMessage4 != null) {
                            createdAt = lastShowMessage4.getCreatedAt();
                        } else {
                            createdAt = 0;
                        }
                        InterfaceC1490905sZ<?> interfaceC1490905sZ2 = c879540Yeu.LIZ;
                        if (Intrinsics.LJFF(interfaceC1490905sZ2, C882110Yj3.INSTANCE)) {
                            Long lValueOf = Long.valueOf(C0YNP.LJII(c0y8t.getConversationId()));
                            if (lValueOf.longValue() == -1 || (string = lValueOf.toString()) == null) {
                                return null;
                            }
                            C894700Z8a c894700Z8aLIZ = C896500ZEy.LIZ(unreadCount, zBooleanValue, z, msgType, createdAt, true, c595660NXw2, C10EU.LJIIZILJ(string), System.currentTimeMillis());
                            if (c882270YjJ == null) {
                                r0.LIZIZ = C896480ZEw.LIZIZ(c595660NXw2);
                                r0.LIZJ = c894700Z8aLIZ.LIZ;
                                r0.LIZLLL = c894700Z8aLIZ;
                                return new C882270YjJ<>(c886650YqN, r0);
                            }
                            r0.LIZIZ = C896480ZEw.LIZIZ(c595660NXw2);
                            r0.LIZJ = c894700Z8aLIZ.LIZ;
                            r0.LIZLLL = c894700Z8aLIZ;
                            c882270YjJ.LIZIZ = r0;
                            return c882270YjJ;
                        }
                        if (!Intrinsics.LJFF(interfaceC1490905sZ2, C1606306Qr.INSTANCE)) {
                            return null;
                        }
                        C894700Z8a c894700Z8aLIZ2 = C896500ZEy.LIZ(unreadCount, zBooleanValue, z, msgType, createdAt, false, c595660NXw2, false, System.currentTimeMillis());
                        if (c882270YjJ == null) {
                            r0.LIZIZ = C896480ZEw.LIZIZ(c595660NXw2);
                            r0.LIZJ = c894700Z8aLIZ2.LIZ;
                            r0.LIZLLL = c894700Z8aLIZ2;
                            return new C882270YjJ<>(c886650YqN, r0);
                        }
                        r0.LIZIZ = C896480ZEw.LIZIZ(c595660NXw2);
                        r0.LIZJ = c894700Z8aLIZ2.LIZ;
                        r0.LIZLLL = c894700Z8aLIZ2;
                        c882270YjJ.LIZIZ = r0;
                        return c882270YjJ;
                    }
                    if (!(interfaceC1490905sZ instanceof C1709506mj)) {
                        return null;
                    }
                    C1490405sU<?> c1490405sU2 = c879540Yeu.LIZLLL.get(C882020Yiu.LIZ);
                    if (c1490405sU2 != null) {
                        obj = c1490405sU2.LIZIZ;
                    } else {
                        obj = null;
                    }
                    if (!(obj instanceof C882070Yiz) || (r3 = (C882070Yiz) obj) == 0 || (c595660NXw = r3.LIZ) == null) {
                        return null;
                    }
                    if (c882270YjJ == null) {
                        r3.LIZIZ = C896480ZEw.LIZIZ(c595660NXw);
                        return new C882270YjJ<>(c886650YqN, r3);
                    }
                    r3.LIZIZ = C896480ZEw.LIZIZ(c595660NXw);
                    c882270YjJ.LIZIZ = r3;
                    return c882270YjJ;
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C879510Yer.class))) {
            return new InterfaceC882190YjB() { // from class: X.0Yer
                public final C1491005sa LIZ = C1491005sa.LIZ;
                public final String LIZIZ = "ChatListMsgDraftDecorator";
                public final String LIZJ = "msg_draft_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C879520Yes());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v6, types: [T, X.0I3B, java.lang.Object] */
                @Override // X.InterfaceC882190YjB
                public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
                    C0Y8T c0y8t;
                    C886710YqT c886710YqT = C886710YqT.LIZ;
                    if (!Intrinsics.LJFF(abstractC886530YqB, c886710YqT) || !(c879540Yeu.LIZ instanceof InterfaceC1606206Qq)) {
                        return null;
                    }
                    T t = c879540Yeu.LIZJ;
                    if (!(t instanceof C0Y8T) || (c0y8t = (C0Y8T) t) == null) {
                        return null;
                    }
                    ?? LJIJJ = C0YNP.LIZIZ(c0y8t.getConversationId()).LJIJJ(c0y8t);
                    if (c882270YjJ == null) {
                        return new C882270YjJ<>(c886710YqT, LJIJJ);
                    }
                    c882270YjJ.LIZIZ = LJIJJ;
                    return c882270YjJ;
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C881570YiB.class))) {
            return new InterfaceC882190YjB() { // from class: X.0YiB
                public final C1491005sa LIZ = C1491005sa.LIZ;
                public final String LIZIZ = "ChatListSystemContentOfLastMsgDecorator";
                public final String LIZJ = "system_content_of_last_msg_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C881580YiC());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v7, types: [T, com.ss.android.ugc.aweme.im.message.content.SystemContent, java.lang.Object] */
                @Override // X.InterfaceC882190YjB
                public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
                    C0Y8T c0y8t;
                    C869590Y9l lastShowMessage;
                    C887320YrS c887320YrS = C887320YrS.LIZ;
                    if (!Intrinsics.LJFF(abstractC886530YqB, c887320YrS) || !Intrinsics.LJFF(c879540Yeu.LIZ, C882110Yj3.INSTANCE)) {
                        return null;
                    }
                    T t = c879540Yeu.LIZJ;
                    if (t instanceof C0Y8T) {
                        c0y8t = (C0Y8T) t;
                    } else {
                        c0y8t = null;
                    }
                    IIMChatRoomService iIMChatRoomService = (IIMChatRoomService) ServiceManager.get().getService(IIMChatRoomService.class);
                    if (c0y8t != null) {
                        lastShowMessage = c0y8t.getLastShowMessage();
                    } else {
                        lastShowMessage = null;
                    }
                    ?? LIZJ = iIMChatRoomService.LIZJ(lastShowMessage);
                    if (LIZJ == 0) {
                        return null;
                    }
                    if (c882270YjJ == null) {
                        return new C882270YjJ<>(c887320YrS, LIZJ);
                    }
                    c882270YjJ.LIZIZ = LIZJ;
                    return c882270YjJ;
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C881400Yhu.class))) {
            return new InterfaceC882190YjB() { // from class: X.0Yhu
                public final C1491005sa LIZ = C1491005sa.LIZ;
                public final String LIZIZ = "ChatListVerifyIconDecorator";
                public final String LIZJ = "verify_icon_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C881410Yhv());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.Boolean] */
                @Override // X.InterfaceC882190YjB
                public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
                    Object obj;
                    IMUser iMUser;
                    boolean z;
                    C886740YqW c886740YqW = C886740YqW.LIZ;
                    if (!Intrinsics.LJFF(abstractC886530YqB, c886740YqW) || !Intrinsics.LJFF(c879540Yeu.LIZ, C882110Yj3.INSTANCE)) {
                        return null;
                    }
                    C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C1491505sf.LIZ);
                    if (c1490405sU != null) {
                        obj = c1490405sU.LIZIZ;
                    } else {
                        obj = null;
                    }
                    if (obj instanceof IMUser) {
                        iMUser = (IMUser) obj;
                    } else {
                        iMUser = null;
                    }
                    C881360Yhq.LIZ.getValue().getClass();
                    if (iMUser != null && (!TextUtils.isEmpty(iMUser.getCustomVerify()) || !TextUtils.isEmpty(iMUser.getEnterpriseVerifyReason()))) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (c882270YjJ == null) {
                        return new C882270YjJ<>(c886740YqW, Boolean.valueOf(z));
                    }
                    c882270YjJ.LIZIZ = Boolean.valueOf(z);
                    return c882270YjJ;
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C879640Yf4.class))) {
            return new InterfaceC882190YjB() { // from class: X.0Yf4
                public final C1491005sa LIZ = C1491005sa.LIZ;
                public final String LIZIZ = "ChatListSayHiContentDecorator";
                public final String LIZJ = "say_hi_content_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C879650Yf5());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC882190YjB
                public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
                    Integer numValueOf;
                    Object obj;
                    IMUser iMUser;
                    String displayName;
                    T tJ4;
                    C0Y8T c0y8t;
                    C869590Y9l lastShowMessage;
                    C886730YqV c886730YqV = C886730YqV.LIZ;
                    if (!Intrinsics.LJFF(abstractC886530YqB, c886730YqV) || !Intrinsics.LJFF(c879540Yeu.LIZ, C882110Yj3.INSTANCE)) {
                        return null;
                    }
                    T t = c879540Yeu.LIZJ;
                    if ((t instanceof C0Y8T) && (c0y8t = (C0Y8T) t) != null && (lastShowMessage = c0y8t.getLastShowMessage()) != null) {
                        numValueOf = Integer.valueOf(lastShowMessage.getMsgType());
                    } else {
                        numValueOf = null;
                    }
                    C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C1491505sf.LIZ);
                    if (c1490405sU != null) {
                        obj = c1490405sU.LIZIZ;
                    } else {
                        obj = null;
                    }
                    if (obj instanceof IMUser) {
                        iMUser = (IMUser) obj;
                    } else {
                        iMUser = null;
                    }
                    if (numValueOf == null || numValueOf.intValue() != 15) {
                        return null;
                    }
                    if (iMUser != null && iMUser.isBlocked()) {
                        tJ4 = C2213981Bky.LIZIZ.getApplicationContext().getString(2131828568);
                    } else {
                        String string = C2213981Bky.LIZIZ.getApplicationContext().getString(2131835785);
                        Object[] objArr = new Object[1];
                        if (iMUser == null || (displayName = iMUser.getDisplayName()) == null) {
                            displayName = "";
                        }
                        objArr[0] = displayName;
                        tJ4 = C786410Ut5.j4(string, Arrays.copyOf(objArr, 1));
                    }
                    if (c882270YjJ == null) {
                        return new C882270YjJ<>(c886730YqV, tJ4);
                    }
                    c882270YjJ.LIZIZ = tJ4;
                    return c882270YjJ;
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C881830Yib.class))) {
            return new InterfaceC882190YjB() { // from class: X.0Yib
                public final C1517705wt LIZ = new C1517705wt(C13LQ.LJLIIL(new InterfaceC1517505wr[]{C1517305wp.LIZ, C1517405wq.LIZ}));
                public final String LIZIZ = "ChatListTypingDecorator";
                public final String LIZJ = "typing_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C881840Yic());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC882190YjB
                public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
                    T t;
                    C887340YrU c887340YrU = C887340YrU.LIZ;
                    if (!Intrinsics.LJFF(abstractC886530YqB, c887340YrU) || !(c879540Yeu.LIZ instanceof InterfaceC1606206Qq)) {
                        return null;
                    }
                    C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C1516905wl.LIZ);
                    if (c1490405sU != null) {
                        t = c1490405sU.LIZIZ;
                    } else {
                        t = 0;
                    }
                    if (!(t instanceof C1516605wi) || t == 0) {
                        return null;
                    }
                    if (c882270YjJ == null) {
                        return new C882270YjJ<>(c887340YrU, t);
                    }
                    c882270YjJ.LIZIZ = t;
                    return c882270YjJ;
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C881860Yie.class))) {
            return new InterfaceC882190YjB() { // from class: X.0Yie
                public final C1517705wt LIZ = new C1517705wt(Collections.singleton(C1517405wq.LIZ));
                public final String LIZIZ = "ChatListMultiEditDecorator";
                public final String LIZJ = "multi_edit_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C881870Yif());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC882190YjB
                public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
                    T t;
                    C887070Yr3 c887070Yr3 = C887070Yr3.LIZ;
                    if (!Intrinsics.LJFF(abstractC886530YqB, c887070Yr3) || !(c879540Yeu.LIZ instanceof C882110Yj3)) {
                        return null;
                    }
                    C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C06A4.LIZ);
                    if (c1490405sU != null) {
                        t = c1490405sU.LIZIZ;
                    } else {
                        t = 0;
                    }
                    if (!(t instanceof C1722406oo) || t == 0) {
                        return null;
                    }
                    if (c882270YjJ == null) {
                        return new C882270YjJ<>(c887070Yr3, t);
                    }
                    c882270YjJ.LIZIZ = t;
                    return c882270YjJ;
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C881610YiF.class))) {
            return new InterfaceC882190YjB() { // from class: X.0YiF
                public final C1517705wt LIZ = new C1517705wt(C13LQ.LJLIIL(new InterfaceC1517505wr[]{C1517305wp.LIZ, C1517405wq.LIZ}));
                public final String LIZIZ = "StoryFriendAnniversaryChatListDecorator";
                public final String LIZJ = "story_anniversary_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(593));

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC882190YjB
                public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
                    T t;
                    C886770YqZ c886770YqZ = C886770YqZ.LIZ;
                    if (!Intrinsics.LJFF(abstractC886530YqB, c886770YqZ) || !(c879540Yeu.LIZ instanceof C882110Yj3)) {
                        return null;
                    }
                    C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C881550Yi9.LIZ);
                    if (c1490405sU != null) {
                        t = c1490405sU.LIZIZ;
                    } else {
                        t = 0;
                    }
                    if (!(t instanceof RelationshipCelebrationTarget) || t == 0) {
                        return null;
                    }
                    if (c882270YjJ == null) {
                        return new C882270YjJ<>(c886770YqZ, t);
                    }
                    c882270YjJ.LIZIZ = t;
                    return c882270YjJ;
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C879670Yf7.class))) {
            return new InterfaceC882190YjB() { // from class: X.0Yf7
                public final C1491005sa LIZ = C1491005sa.LIZ;
                public final String LIZIZ = "ChatListChatHintDecorator";
                public final String LIZJ = "chat_hint_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(392));

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC882190YjB
                public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
                    T t;
                    C886690YqR c886690YqR = C886690YqR.LIZ;
                    if (!Intrinsics.LJFF(abstractC886530YqB, c886690YqR)) {
                        return null;
                    }
                    C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C1704406lu.LIZ);
                    if (c1490405sU != null) {
                        t = c1490405sU.LIZIZ;
                    } else {
                        t = 0;
                    }
                    if (!(t instanceof CharSequence) || t == 0) {
                        return null;
                    }
                    InterfaceC1490905sZ<?> interfaceC1490905sZ = c879540Yeu.LIZ;
                    if (!Intrinsics.LJFF(interfaceC1490905sZ, C1606306Qr.INSTANCE) && !Intrinsics.LJFF(interfaceC1490905sZ, C882110Yj3.INSTANCE)) {
                        return null;
                    }
                    if (c882270YjJ == null) {
                        return new C882270YjJ<>(c886690YqR, t);
                    }
                    c882270YjJ.LIZIZ = t;
                    return c882270YjJ;
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C879830YfN.class))) {
            return new InterfaceC882190YjB() { // from class: X.0YfN
                public final C1491005sa LIZ = C1491005sa.LIZ;
                public final String LIZIZ = "ChatListUnreadInfoDecorator";
                public final String LIZJ = "unread_info_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C879840YfO());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v10, types: [T, X.0Ym7, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v26, types: [T, X.0Ym7, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v31, types: [T, X.0Ym7, java.lang.Object] */
                @Override // X.InterfaceC882190YjB
                public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
                    Object obj;
                    C879950YfZ c879950YfZ;
                    ?? LIZJ;
                    C0Y8T c0y8t;
                    Object obj2;
                    LastMessageProperty lastMessageProperty;
                    Object obj3;
                    IMUser iMUser;
                    boolean z;
                    FilterTabType filterTabType;
                    C878950Ydx c878950Ydx;
                    C879860YfQ c879860YfQ;
                    C880150Yft c880150Yft;
                    C886780Yqa c886780Yqa = C886780Yqa.LIZ;
                    if (!Intrinsics.LJFF(abstractC886530YqB, c886780Yqa)) {
                        return null;
                    }
                    C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C879970Yfb.LIZ);
                    if (c1490405sU != null) {
                        obj = c1490405sU.LIZIZ;
                    } else {
                        obj = null;
                    }
                    if ((obj instanceof C880150Yft) && (c880150Yft = (C880150Yft) obj) != null) {
                        ?? LIZ = C880280Yg6.LIZ(c880150Yft.LIZIZ, c880150Yft.LIZ);
                        if (LIZ == 0) {
                            return null;
                        }
                        if (c882270YjJ == null) {
                            return new C882270YjJ<>(c886780Yqa, LIZ);
                        }
                        c882270YjJ.LIZIZ = LIZ;
                        return c882270YjJ;
                    }
                    InterfaceC1490905sZ<?> interfaceC1490905sZ = c879540Yeu.LIZ;
                    if (interfaceC1490905sZ instanceof InterfaceC1606206Qq) {
                        T t = c879540Yeu.LIZJ;
                        if (!(t instanceof C0Y8T) || (c0y8t = (C0Y8T) t) == null) {
                            return null;
                        }
                        C882270YjJ<?, ?> c882270YjJ2 = c879540Yeu.LJ.get(C886900Yqm.LIZ);
                        if (c882270YjJ2 != null) {
                            obj2 = c882270YjJ2.LIZIZ;
                        } else {
                            obj2 = null;
                        }
                        if ((obj2 instanceof C879860YfQ) && (c879860YfQ = (C879860YfQ) obj2) != null) {
                            lastMessageProperty = c879860YfQ.lastMessageProperty;
                        } else {
                            lastMessageProperty = null;
                        }
                        C1490405sU<?> c1490405sU2 = c879540Yeu.LIZLLL.get(C1491505sf.LIZ);
                        if (c1490405sU2 != null) {
                            obj3 = c1490405sU2.LIZIZ;
                        } else {
                            obj3 = null;
                        }
                        if (obj3 instanceof IMUser) {
                            iMUser = (IMUser) obj3;
                        } else {
                            iMUser = null;
                        }
                        int unreadCount = (int) c0y8t.getUnreadCount();
                        boolean zBooleanValue = C876830YaX.LIZ(c0y8t).getFirst().booleanValue();
                        boolean zIsMute = c0y8t.isMute();
                        if (iMUser != null && iMUser.isBlock() && c0y8t.isSingleChat()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        boolean zLIZIZ = C0YU9.LIZIZ(lastMessageProperty);
                        boolean zLIZJ = C876830YaX.LIZJ(c0y8t);
                        if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null) {
                            filterTabType = c878950Ydx.LLILLL;
                        } else {
                            filterTabType = null;
                        }
                        ?? LIZJ2 = C880280Yg6.LIZJ(unreadCount, zBooleanValue, zIsMute, z, zLIZIZ, zLIZJ, filterTabType, C876830YaX.LIZIZ(c0y8t));
                        if (LIZJ2 == 0) {
                            return null;
                        }
                        if (c882270YjJ == null) {
                            return new C882270YjJ<>(c886780Yqa, LIZJ2);
                        }
                        c882270YjJ.LIZIZ = LIZJ2;
                        return c882270YjJ;
                    }
                    if (!Intrinsics.LJFF(interfaceC1490905sZ, C878910Ydt.INSTANCE)) {
                        return null;
                    }
                    T t2 = c879540Yeu.LIZJ;
                    if (!(t2 instanceof C879950YfZ) || (c879950YfZ = (C879950YfZ) t2) == null || (LIZJ = C880280Yg6.LIZJ(c879950YfZ.LJII, false, false, false, false, c879950YfZ.LJIIIIZZ, null, false)) == 0) {
                        return null;
                    }
                    if (c882270YjJ == null) {
                        return new C882270YjJ<>(c886780Yqa, LIZJ);
                    }
                    c882270YjJ.LIZIZ = LIZJ;
                    return c882270YjJ;
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C881430Yhx.class))) {
            return new InterfaceC882190YjB() { // from class: X.0Yhx
                public final C1491005sa LIZ = C1491005sa.LIZ;
                public final String LIZIZ = "ChatListChatLabelDecorator";
                public final String LIZJ = "chat_label_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C881440Yhy());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC882190YjB
                public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
                    C0Y8T c0y8t;
                    T tLIZ;
                    Object obj;
                    C886670YqP c886670YqP = C886670YqP.LIZ;
                    if (!Intrinsics.LJFF(abstractC886530YqB, c886670YqP) || !Intrinsics.LJFF(c879540Yeu.LIZ, C882110Yj3.INSTANCE)) {
                        return null;
                    }
                    if (C287630BPd.LIZ()) {
                        C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C1712306nB.LIZ);
                        if (c1490405sU != null) {
                            obj = c1490405sU.LIZIZ;
                        } else {
                            obj = null;
                        }
                        boolean z = obj instanceof List;
                        tLIZ = obj;
                        if (z) {
                        }
                        return null;
                    }
                    T t = c879540Yeu.LIZJ;
                    if (t instanceof C0Y8T) {
                        c0y8t = (C0Y8T) t;
                    } else {
                        c0y8t = null;
                    }
                    C881360Yhq.LIZ.getValue().getClass();
                    tLIZ = C881360Yhq.LIZ(c0y8t, interfaceC879010Ye3);
                    if (tLIZ != 0) {
                        if (c882270YjJ == null) {
                            return new C882270YjJ<>(c886670YqP, tLIZ);
                        }
                        c882270YjJ.LIZIZ = tLIZ;
                        return c882270YjJ;
                    }
                    return null;
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C881470Yi1.class))) {
            return new InterfaceC882190YjB() { // from class: X.0Yi1
                public final C1491005sa LIZ = C1491005sa.LIZ;
                public final String LIZIZ = "ChatListStarredDecorator";
                public final String LIZJ = "starred_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(582));

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v6, types: [T, java.lang.Boolean] */
                @Override // X.InterfaceC882190YjB
                public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
                    C0Y8T c0y8t;
                    C886760YqY c886760YqY = C886760YqY.LIZ;
                    if (!Intrinsics.LJFF(abstractC886530YqB, c886760YqY) || !(c879540Yeu.LIZ instanceof InterfaceC1606206Qq)) {
                        return null;
                    }
                    T t = c879540Yeu.LIZJ;
                    if (t instanceof C0Y8T) {
                        c0y8t = (C0Y8T) t;
                    } else {
                        c0y8t = null;
                    }
                    if (c882270YjJ == null) {
                        c882270YjJ = null;
                    }
                    boolean z = true;
                    if (c882270YjJ != null) {
                        if (c0y8t == null || !C879070Ye9.LJFF(c0y8t)) {
                            z = false;
                        }
                        c882270YjJ.LIZIZ = Boolean.valueOf(z);
                        return c882270YjJ;
                    }
                    if (c0y8t == null || !C879070Ye9.LJFF(c0y8t)) {
                        z = false;
                    }
                    return new C882270YjJ<>(c886760YqY, Boolean.valueOf(z));
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C880020Yfg.class))) {
            return new InterfaceC882190YjB() { // from class: X.0Yfg
                public final C1491005sa LIZ = C1491005sa.LIZ;
                public final String LIZIZ = "ChatListChatStatusDecorator";
                public final String LIZJ = "chat_status_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C880030Yfh());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
                /* JADX WARN: Type inference failed for: r1v2, types: [T, X.0Yq2, java.lang.Object] */
                @Override // X.InterfaceC882190YjB
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.C882270YjJ<?, ?> LJ(X.InterfaceC879010Ye3 r9, X.C879540Yeu<?> r10, X.AbstractC886530YqB<?, ?> r11, X.C882270YjJ<?, ?> r12) {
                    /*
                        r8 = this;
                        X.0YqS r3 = X.C886700YqS.LIZ
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r11, r3)
                        r6 = 0
                        if (r0 == 0) goto L58
                        T r2 = r10.LIZJ
                        boolean r0 = r2 instanceof X.C0Y8T
                        if (r0 == 0) goto La0
                        X.0Y8T r2 = (X.C0Y8T) r2
                        if (r2 == 0) goto La0
                        boolean r0 = r2.isMute()
                        r7 = 1
                        if (r0 == 0) goto L69
                        boolean r0 = r9 instanceof X.C878950Ydx
                        if (r0 == 0) goto L67
                        X.0Ydx r9 = (X.C878950Ydx) r9
                        if (r9 == 0) goto L67
                        com.ss.android.ugc.aweme.inbox.filter.FilterTabType r1 = r9.LLILLL
                    L24:
                        com.ss.android.ugc.aweme.inbox.filter.FilterTabType r0 = com.ss.android.ugc.aweme.inbox.filter.FilterTabType.SPAM
                        if (r1 == r0) goto L69
                        r5 = 1
                    L29:
                        int r0 = X.C0YU8.LIZ(r2)
                        if (r0 <= 0) goto L65
                        r4 = 1
                    L30:
                        X.05sZ<T> r1 = r10.LIZ
                        X.06Qp r0 = X.C1606106Qp.INSTANCE
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                        if (r0 != 0) goto L6e
                        X.0Yj3 r0 = X.C882110Yj3.INSTANCE
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                        if (r0 != 0) goto L6e
                        X.06Qr r0 = X.C1606306Qr.INSTANCE
                        boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                        if (r0 == 0) goto L58
                        boolean r0 = X.C880000Yfe.LIZ
                        boolean r0 = X.C880000Yfe.LIZ
                        if (r0 == 0) goto L59
                        r1 = r6
                    L51:
                        if (r12 != 0) goto L6b
                        X.0YjJ r6 = new X.0YjJ
                        r6.<init>(r3, r1)
                    L58:
                        return r6
                    L59:
                        X.0Yq2 r1 = new X.0Yq2
                        X.0ZFW r0 = X.C0ZFW.LIZ
                        boolean r0 = r0.LJJIIJZLJL(r2)
                        r1.<init>(r0, r5, r4)
                        goto L51
                    L65:
                        r4 = 0
                        goto L30
                    L67:
                        r1 = r6
                        goto L24
                    L69:
                        r5 = 0
                        goto L29
                    L6b:
                        r12.LIZIZ = r1
                        return r12
                    L6e:
                        java.util.Map<X.05sg<?>, X.05sU<?>> r1 = r10.LIZLLL
                        X.05sf r0 = X.C1491505sf.LIZ
                        java.lang.Object r0 = r1.get(r0)
                        X.05sU r0 = (X.C1490405sU) r0
                        if (r0 == 0) goto L9b
                        T r2 = r0.LIZIZ
                    L7c:
                        boolean r0 = r2 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMUser
                        if (r0 == 0) goto L99
                        com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r2 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r2
                    L82:
                        X.0Yq2 r1 = new X.0Yq2
                        if (r2 == 0) goto L97
                        boolean r0 = r2.isBlock()
                        if (r0 != r7) goto L97
                    L8c:
                        r1.<init>(r7, r5, r4)
                        if (r12 != 0) goto L9d
                        X.0YjJ r6 = new X.0YjJ
                        r6.<init>(r3, r1)
                        return r6
                    L97:
                        r7 = 0
                        goto L8c
                    L99:
                        r2 = r6
                        goto L82
                    L9b:
                        r2 = r6
                        goto L7c
                    L9d:
                        r12.LIZIZ = r1
                        return r12
                    La0:
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C880020Yfg.LJ(X.0Ye3, X.0Yeu, X.0YqB, X.0YjJ):X.0YjJ");
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C881210Yhb.class))) {
            return new InterfaceC882190YjB() { // from class: X.0Yhb
                public final C1491005sa LIZ = C1491005sa.LIZ;
                public final String LIZIZ = "ChatListUnreadMUFDecorator";
                public final String LIZJ = "unread_muf_decorator";
                public final boolean LIZLLL = true;
                public final C01GW LJ = C452501pT.LIZIZ(new C881220Yhc());

                @Override // X.InterfaceC882190YjB
                public final List<AbstractC886530YqB<?, ?>> LIZJ() {
                    return (List) this.LJ.getValue();
                }

                @Override // X.InterfaceC882190YjB
                public final String LIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC882190YjB
                public final InterfaceC1517005wm LIZLLL() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final boolean LJFF() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC882190YjB
                public final String getTag() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC882190YjB
                public final void LIZIZ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C882180YjA.LIZ(this, interfaceC879010Ye3, c879540Yeu);
                }

                /* JADX WARN: Type inference failed for: r0v12, types: [T, java.lang.Long] */
                @Override // X.InterfaceC882190YjB
                public final C882270YjJ<?, ?> LJ(InterfaceC879010Ye3 interfaceC879010Ye3, C879540Yeu<?> c879540Yeu, AbstractC886530YqB<?, ?> abstractC886530YqB, C882270YjJ<?, ?> c882270YjJ) {
                    Object obj;
                    Long l;
                    Object obj2;
                    long jLongValue;
                    Long l2;
                    C887280YrO c887280YrO = C887280YrO.LIZ;
                    if (!Intrinsics.LJFF(abstractC886530YqB, c887280YrO) || !Intrinsics.LJFF(c879540Yeu.LIZ, C882110Yj3.INSTANCE)) {
                        return null;
                    }
                    C1490405sU<?> c1490405sU = c879540Yeu.LIZLLL.get(C881200Yha.LIZ);
                    if (c1490405sU != null) {
                        obj = c1490405sU.LIZIZ;
                    } else {
                        obj = null;
                    }
                    if (!(obj instanceof Long) || (l = (Long) obj) == null) {
                        return null;
                    }
                    long jLongValue2 = l.longValue();
                    C882270YjJ<?, ?> c882270YjJ2 = c879540Yeu.LJ.get(C887290YrP.LIZ);
                    if (c882270YjJ2 != null) {
                        obj2 = c882270YjJ2.LIZIZ;
                    } else {
                        obj2 = null;
                    }
                    if ((obj2 instanceof Long) && (l2 = (Long) obj2) != null) {
                        jLongValue = l2.longValue();
                    } else {
                        jLongValue = Long.MAX_VALUE;
                    }
                    if (jLongValue >= jLongValue2) {
                        return null;
                    }
                    if (c882270YjJ == null) {
                        return new C882270YjJ<>(c887280YrO, Long.valueOf(jLongValue2));
                    }
                    c882270YjJ.LIZIZ = Long.valueOf(jLongValue2);
                    return c882270YjJ;
                }
            };
        }
        return null;
    }

    public static boolean LJFF(String str) {
        if (!C869290Y8h.LJIIL.contains(str)) {
            return false;
        }
        if (!Intrinsics.LJFF(str, "preload_all") && !LJII()) {
            return false;
        }
        return true;
    }

    public static InterfaceC882100Yj2 LJIIIIZZ(C13IQ c13iq) {
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C1490105sR.class))) {
            return new C1490105sR();
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C880130Yfr.class))) {
            return new C880130Yfr();
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C879690Yf9.class))) {
            return new C879690Yf9();
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C881110YhR.class))) {
            return new C881110YhR();
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C881600YiE.class))) {
            return new C881600YiE();
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C881970Yip.class))) {
            return new C881970Yip();
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C1516305wf.class))) {
            return new C1516305wf();
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C06A0.class))) {
            return new C06A0();
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C881530Yi7.class))) {
            return new C881530Yi7();
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C880350YgD.class))) {
            return new C880350YgD();
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C1704306lt.class))) {
            return new C1704306lt();
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C1513005w8.class))) {
            return new C1513005w8();
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C881910Yij.class))) {
            return new C881910Yij();
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C1711806n6.class))) {
            return new C1711806n6();
        }
        return null;
    }

    public static AbstractC886890Yql LJIIIZ(C13IQ c13iq) {
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C887150YrB.class))) {
            return new AbstractC886890Yql<C0Z8N, C887050Yr1, C0Z8T>() { // from class: X.0YrB
                public final C01GW LIZ = C452501pT.LIZIZ(new C887120Yr8());
                public final String LIZIZ = "single_chat_vo_converter";

                @Override // X.InterfaceC886490Yq7
                public final InterfaceC886910Yqn LIZIZ() {
                    return (AbstractC887250YrL) this.LIZ.getValue();
                }

                @Override // X.InterfaceC886490Yq7
                public final String LIZ() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC886490Yq7
                public final boolean LIZLLL(C879540Yeu<?> c879540Yeu) {
                    return Intrinsics.LJFF(c879540Yeu.LIZ, C882110Yj3.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:102:0x0185  */
                /* JADX WARN: Removed duplicated region for block: B:107:0x0197  */
                /* JADX WARN: Removed duplicated region for block: B:112:0x01a7  */
                /* JADX WARN: Removed duplicated region for block: B:117:0x01b7  */
                /* JADX WARN: Removed duplicated region for block: B:122:0x01c9  */
                /* JADX WARN: Removed duplicated region for block: B:127:0x01d9  */
                /* JADX WARN: Removed duplicated region for block: B:132:0x01e9  */
                /* JADX WARN: Removed duplicated region for block: B:137:0x01fb  */
                /* JADX WARN: Removed duplicated region for block: B:140:0x0207  */
                /* JADX WARN: Removed duplicated region for block: B:143:0x0213  */
                /* JADX WARN: Removed duplicated region for block: B:148:0x0225  */
                /* JADX WARN: Removed duplicated region for block: B:153:0x0237  */
                /* JADX WARN: Removed duplicated region for block: B:156:0x0243  */
                /* JADX WARN: Removed duplicated region for block: B:159:0x024f  */
                /* JADX WARN: Removed duplicated region for block: B:162:0x025b  */
                /* JADX WARN: Removed duplicated region for block: B:165:0x0265  */
                /* JADX WARN: Removed duplicated region for block: B:170:0x0275  */
                /* JADX WARN: Removed duplicated region for block: B:175:0x0287  */
                /* JADX WARN: Removed duplicated region for block: B:180:0x0299  */
                /* JADX WARN: Removed duplicated region for block: B:183:0x02a5  */
                /* JADX WARN: Removed duplicated region for block: B:186:0x02af  */
                /* JADX WARN: Removed duplicated region for block: B:191:0x02bf  */
                /* JADX WARN: Removed duplicated region for block: B:196:0x02cf  */
                /* JADX WARN: Removed duplicated region for block: B:201:0x02e1  */
                /* JADX WARN: Removed duplicated region for block: B:204:0x02ed  */
                /* JADX WARN: Removed duplicated region for block: B:207:0x02f9  */
                /* JADX WARN: Removed duplicated region for block: B:210:0x0305  */
                /* JADX WARN: Removed duplicated region for block: B:215:0x0317  */
                /* JADX WARN: Removed duplicated region for block: B:218:0x0323  */
                /* JADX WARN: Removed duplicated region for block: B:221:0x0371  */
                /* JADX WARN: Removed duplicated region for block: B:222:0x0374  */
                /* JADX WARN: Removed duplicated region for block: B:223:0x0377  */
                /* JADX WARN: Removed duplicated region for block: B:224:0x037a  */
                /* JADX WARN: Removed duplicated region for block: B:225:0x037e  */
                /* JADX WARN: Removed duplicated region for block: B:226:0x0382  */
                /* JADX WARN: Removed duplicated region for block: B:227:0x0386  */
                /* JADX WARN: Removed duplicated region for block: B:228:0x038a  */
                /* JADX WARN: Removed duplicated region for block: B:229:0x038e  */
                /* JADX WARN: Removed duplicated region for block: B:230:0x0392  */
                /* JADX WARN: Removed duplicated region for block: B:231:0x0396  */
                /* JADX WARN: Removed duplicated region for block: B:232:0x039a  */
                /* JADX WARN: Removed duplicated region for block: B:233:0x039e  */
                /* JADX WARN: Removed duplicated region for block: B:234:0x03a2  */
                /* JADX WARN: Removed duplicated region for block: B:235:0x03a6  */
                /* JADX WARN: Removed duplicated region for block: B:236:0x03aa  */
                /* JADX WARN: Removed duplicated region for block: B:237:0x03ae  */
                /* JADX WARN: Removed duplicated region for block: B:238:0x03b2  */
                /* JADX WARN: Removed duplicated region for block: B:239:0x03b6  */
                /* JADX WARN: Removed duplicated region for block: B:240:0x03ba  */
                /* JADX WARN: Removed duplicated region for block: B:241:0x03be  */
                /* JADX WARN: Removed duplicated region for block: B:242:0x03c2  */
                /* JADX WARN: Removed duplicated region for block: B:243:0x03c6  */
                /* JADX WARN: Removed duplicated region for block: B:244:0x03ca  */
                /* JADX WARN: Removed duplicated region for block: B:245:0x03ce  */
                /* JADX WARN: Removed duplicated region for block: B:246:0x03d2  */
                /* JADX WARN: Removed duplicated region for block: B:247:0x03d6  */
                /* JADX WARN: Removed duplicated region for block: B:248:0x03da  */
                /* JADX WARN: Removed duplicated region for block: B:249:0x03de  */
                /* JADX WARN: Removed duplicated region for block: B:250:0x03e2  */
                /* JADX WARN: Removed duplicated region for block: B:251:0x03e6  */
                /* JADX WARN: Removed duplicated region for block: B:252:0x03ed  */
                /* JADX WARN: Removed duplicated region for block: B:253:0x03f1  */
                /* JADX WARN: Removed duplicated region for block: B:256:0x03f7 A[PHI: r87
                  0x03f7: PHI (r87v1 boolean) = (r87v0 boolean), (r87v3 boolean) binds: [B:254:0x03f3, B:70:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:259:0x0401  */
                /* JADX WARN: Removed duplicated region for block: B:260:0x0406 A[PHI: r73 r74 r75 r76 r77 r78 r80 r81 r82 r84
                  0x0406: PHI (r73v7 int) = (r73v6 int), (r73v13 int) binds: [B:56:0x00bc, B:58:0x00c2] A[DONT_GENERATE, DONT_INLINE]
                  0x0406: PHI (r74v7 java.lang.Integer) = (r74v6 java.lang.Integer), (r74v13 java.lang.Integer) binds: [B:56:0x00bc, B:58:0x00c2] A[DONT_GENERATE, DONT_INLINE]
                  0x0406: PHI (r75v6 java.lang.String) = (r75v5 java.lang.String), (r75v12 java.lang.String) binds: [B:56:0x00bc, B:58:0x00c2] A[DONT_GENERATE, DONT_INLINE]
                  0x0406: PHI (r76v5 int) = (r76v4 int), (r76v11 int) binds: [B:56:0x00bc, B:58:0x00c2] A[DONT_GENERATE, DONT_INLINE]
                  0x0406: PHI (r77v5 boolean) = (r77v4 boolean), (r77v11 boolean) binds: [B:56:0x00bc, B:58:0x00c2] A[DONT_GENERATE, DONT_INLINE]
                  0x0406: PHI (r78v4 long) = (r78v3 long), (r78v10 long) binds: [B:56:0x00bc, B:58:0x00c2] A[DONT_GENERATE, DONT_INLINE]
                  0x0406: PHI (r80v3 boolean) = (r80v2 boolean), (r80v9 boolean) binds: [B:56:0x00bc, B:58:0x00c2] A[DONT_GENERATE, DONT_INLINE]
                  0x0406: PHI (r81v2 boolean) = (r81v1 boolean), (r81v8 boolean) binds: [B:56:0x00bc, B:58:0x00c2] A[DONT_GENERATE, DONT_INLINE]
                  0x0406: PHI (r82v2 X.0Y9l) = (r82v1 X.0Y9l), (r82v8 X.0Y9l) binds: [B:56:0x00bc, B:58:0x00c2] A[DONT_GENERATE, DONT_INLINE]
                  0x0406: PHI (r84v1 boolean) = (r84v0 boolean), (r84v7 boolean) binds: [B:56:0x00bc, B:58:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:263:0x040c A[PHI: r73 r74 r75 r76 r77 r78 r80 r81 r82 r84 r86
                  0x040c: PHI (r73v8 int) = (r73v7 int), (r73v12 int) binds: [B:261:0x0408, B:258:0x03ff] A[DONT_GENERATE, DONT_INLINE]
                  0x040c: PHI (r74v8 java.lang.Integer) = (r74v7 java.lang.Integer), (r74v12 java.lang.Integer) binds: [B:261:0x0408, B:258:0x03ff] A[DONT_GENERATE, DONT_INLINE]
                  0x040c: PHI (r75v7 java.lang.String) = (r75v6 java.lang.String), (r75v11 java.lang.String) binds: [B:261:0x0408, B:258:0x03ff] A[DONT_GENERATE, DONT_INLINE]
                  0x040c: PHI (r76v6 int) = (r76v5 int), (r76v10 int) binds: [B:261:0x0408, B:258:0x03ff] A[DONT_GENERATE, DONT_INLINE]
                  0x040c: PHI (r77v6 boolean) = (r77v5 boolean), (r77v10 boolean) binds: [B:261:0x0408, B:258:0x03ff] A[DONT_GENERATE, DONT_INLINE]
                  0x040c: PHI (r78v5 long) = (r78v4 long), (r78v9 long) binds: [B:261:0x0408, B:258:0x03ff] A[DONT_GENERATE, DONT_INLINE]
                  0x040c: PHI (r80v4 boolean) = (r80v3 boolean), (r80v8 boolean) binds: [B:261:0x0408, B:258:0x03ff] A[DONT_GENERATE, DONT_INLINE]
                  0x040c: PHI (r81v3 boolean) = (r81v2 boolean), (r81v7 boolean) binds: [B:261:0x0408, B:258:0x03ff] A[DONT_GENERATE, DONT_INLINE]
                  0x040c: PHI (r82v3 X.0Y9l) = (r82v2 X.0Y9l), (r82v7 X.0Y9l) binds: [B:261:0x0408, B:258:0x03ff] A[DONT_GENERATE, DONT_INLINE]
                  0x040c: PHI (r84v2 boolean) = (r84v1 boolean), (r84v6 boolean) binds: [B:261:0x0408, B:258:0x03ff] A[DONT_GENERATE, DONT_INLINE]
                  0x040c: PHI (r86v1 boolean) = (r86v0 boolean), (r86v5 boolean) binds: [B:261:0x0408, B:258:0x03ff] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:266:0x0412  */
                /* JADX WARN: Removed duplicated region for block: B:268:0x041a  */
                /* JADX WARN: Removed duplicated region for block: B:272:0x0424 A[PHI: r73 r74 r75
                  0x0424: PHI (r73v2 int) = (r73v1 int), (r73v18 int) binds: [B:270:0x0420, B:36:0x007a] A[DONT_GENERATE, DONT_INLINE]
                  0x0424: PHI (r74v2 java.lang.Integer) = (r74v1 java.lang.Integer), (r74v18 java.lang.Integer) binds: [B:270:0x0420, B:36:0x007a] A[DONT_GENERATE, DONT_INLINE]
                  0x0424: PHI (r75v1 java.lang.String) = (r75v0 java.lang.String), (r75v17 java.lang.String) binds: [B:270:0x0420, B:36:0x007a] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:275:0x042a A[PHI: r73 r74 r75 r76 r77
                  0x042a: PHI (r73v3 int) = (r73v2 int), (r73v17 int) binds: [B:274:0x0428, B:39:0x0088] A[DONT_GENERATE, DONT_INLINE]
                  0x042a: PHI (r74v3 java.lang.Integer) = (r74v2 java.lang.Integer), (r74v17 java.lang.Integer) binds: [B:274:0x0428, B:39:0x0088] A[DONT_GENERATE, DONT_INLINE]
                  0x042a: PHI (r75v2 java.lang.String) = (r75v1 java.lang.String), (r75v16 java.lang.String) binds: [B:274:0x0428, B:39:0x0088] A[DONT_GENERATE, DONT_INLINE]
                  0x042a: PHI (r76v1 int) = (r76v0 int), (r76v15 int) binds: [B:274:0x0428, B:39:0x0088] A[DONT_GENERATE, DONT_INLINE]
                  0x042a: PHI (r77v1 boolean) = (r77v0 boolean), (r77v15 boolean) binds: [B:274:0x0428, B:39:0x0088] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:278:0x0430 A[PHI: r73 r74 r75 r76 r77 r78
                  0x0430: PHI (r73v4 int) = (r73v3 int), (r73v16 int) binds: [B:276:0x042c, B:42:0x0092] A[DONT_GENERATE, DONT_INLINE]
                  0x0430: PHI (r74v4 java.lang.Integer) = (r74v3 java.lang.Integer), (r74v16 java.lang.Integer) binds: [B:276:0x042c, B:42:0x0092] A[DONT_GENERATE, DONT_INLINE]
                  0x0430: PHI (r75v3 java.lang.String) = (r75v2 java.lang.String), (r75v15 java.lang.String) binds: [B:276:0x042c, B:42:0x0092] A[DONT_GENERATE, DONT_INLINE]
                  0x0430: PHI (r76v2 int) = (r76v1 int), (r76v14 int) binds: [B:276:0x042c, B:42:0x0092] A[DONT_GENERATE, DONT_INLINE]
                  0x0430: PHI (r77v2 boolean) = (r77v1 boolean), (r77v14 boolean) binds: [B:276:0x042c, B:42:0x0092] A[DONT_GENERATE, DONT_INLINE]
                  0x0430: PHI (r78v1 long) = (r78v0 long), (r78v13 long) binds: [B:276:0x042c, B:42:0x0092] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:281:0x0436 A[PHI: r73 r74 r75 r76 r77 r78 r80
                  0x0436: PHI (r73v5 int) = (r73v4 int), (r73v15 int) binds: [B:279:0x0432, B:45:0x009a] A[DONT_GENERATE, DONT_INLINE]
                  0x0436: PHI (r74v5 java.lang.Integer) = (r74v4 java.lang.Integer), (r74v15 java.lang.Integer) binds: [B:279:0x0432, B:45:0x009a] A[DONT_GENERATE, DONT_INLINE]
                  0x0436: PHI (r75v4 java.lang.String) = (r75v3 java.lang.String), (r75v14 java.lang.String) binds: [B:279:0x0432, B:45:0x009a] A[DONT_GENERATE, DONT_INLINE]
                  0x0436: PHI (r76v3 int) = (r76v2 int), (r76v13 int) binds: [B:279:0x0432, B:45:0x009a] A[DONT_GENERATE, DONT_INLINE]
                  0x0436: PHI (r77v3 boolean) = (r77v2 boolean), (r77v13 boolean) binds: [B:279:0x0432, B:45:0x009a] A[DONT_GENERATE, DONT_INLINE]
                  0x0436: PHI (r78v2 long) = (r78v1 long), (r78v12 long) binds: [B:279:0x0432, B:45:0x009a] A[DONT_GENERATE, DONT_INLINE]
                  0x0436: PHI (r80v1 boolean) = (r80v0 boolean), (r80v11 boolean) binds: [B:279:0x0432, B:45:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:284:0x043e  */
                /* JADX WARN: Removed duplicated region for block: B:288:0x0448 A[PHI: r69
                  0x0448: PHI (r69v1 boolean) = (r69v0 boolean), (r69v3 boolean), (r69v3 boolean) binds: [B:286:0x0444, B:22:0x0041, B:24:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
                /* JADX WARN: Removed duplicated region for block: B:35:0x0076 A[PHI: r73 r74 r75
                  0x0076: PHI (r73v18 int) = (r73v1 int), (r73v19 int) binds: [B:270:0x0420, B:34:0x0072] A[DONT_GENERATE, DONT_INLINE]
                  0x0076: PHI (r74v18 java.lang.Integer) = (r74v1 java.lang.Integer), (r74v19 java.lang.Integer) binds: [B:270:0x0420, B:34:0x0072] A[DONT_GENERATE, DONT_INLINE]
                  0x0076: PHI (r75v17 java.lang.String) = (r75v0 java.lang.String), (r75v18 java.lang.String) binds: [B:270:0x0420, B:34:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x009c  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00ba A[PHI: r73 r74 r75 r76 r77 r78 r80 r81 r82
                  0x00ba: PHI (r73v6 int) = (r73v5 int), (r73v14 int), (r73v14 int), (r73v14 int) binds: [B:283:0x043a, B:48:0x00a6, B:50:0x00ac, B:54:0x00b8] A[DONT_GENERATE, DONT_INLINE]
                  0x00ba: PHI (r74v6 java.lang.Integer) = (r74v5 java.lang.Integer), (r74v14 java.lang.Integer), (r74v14 java.lang.Integer), (r74v14 java.lang.Integer) binds: [B:283:0x043a, B:48:0x00a6, B:50:0x00ac, B:54:0x00b8] A[DONT_GENERATE, DONT_INLINE]
                  0x00ba: PHI (r75v5 java.lang.String) = (r75v4 java.lang.String), (r75v13 java.lang.String), (r75v13 java.lang.String), (r75v13 java.lang.String) binds: [B:283:0x043a, B:48:0x00a6, B:50:0x00ac, B:54:0x00b8] A[DONT_GENERATE, DONT_INLINE]
                  0x00ba: PHI (r76v4 int) = (r76v3 int), (r76v12 int), (r76v12 int), (r76v12 int) binds: [B:283:0x043a, B:48:0x00a6, B:50:0x00ac, B:54:0x00b8] A[DONT_GENERATE, DONT_INLINE]
                  0x00ba: PHI (r77v4 boolean) = (r77v3 boolean), (r77v12 boolean), (r77v12 boolean), (r77v12 boolean) binds: [B:283:0x043a, B:48:0x00a6, B:50:0x00ac, B:54:0x00b8] A[DONT_GENERATE, DONT_INLINE]
                  0x00ba: PHI (r78v3 long) = (r78v2 long), (r78v11 long), (r78v11 long), (r78v11 long) binds: [B:283:0x043a, B:48:0x00a6, B:50:0x00ac, B:54:0x00b8] A[DONT_GENERATE, DONT_INLINE]
                  0x00ba: PHI (r80v2 boolean) = (r80v1 boolean), (r80v10 boolean), (r80v10 boolean), (r80v10 boolean) binds: [B:283:0x043a, B:48:0x00a6, B:50:0x00ac, B:54:0x00b8] A[DONT_GENERATE, DONT_INLINE]
                  0x00ba: PHI (r81v1 boolean) = (r81v0 boolean), (r81v9 boolean), (r81v9 boolean), (r81v9 boolean) binds: [B:283:0x043a, B:48:0x00a6, B:50:0x00ac, B:54:0x00b8] A[DONT_GENERATE, DONT_INLINE]
                  0x00ba: PHI (r82v1 X.0Y9l) = (r82v0 X.0Y9l), (r82v9 X.0Y9l), (r82v9 X.0Y9l), (r82v9 X.0Y9l) binds: [B:283:0x043a, B:48:0x00a6, B:50:0x00ac, B:54:0x00b8] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:57:0x00be A[PHI: r73 r74 r75 r76 r77 r78 r80 r81 r82 r84
                  0x00be: PHI (r73v13 int) = (r73v6 int), (r73v14 int) binds: [B:56:0x00bc, B:267:0x0416] A[DONT_GENERATE, DONT_INLINE]
                  0x00be: PHI (r74v13 java.lang.Integer) = (r74v6 java.lang.Integer), (r74v14 java.lang.Integer) binds: [B:56:0x00bc, B:267:0x0416] A[DONT_GENERATE, DONT_INLINE]
                  0x00be: PHI (r75v12 java.lang.String) = (r75v5 java.lang.String), (r75v13 java.lang.String) binds: [B:56:0x00bc, B:267:0x0416] A[DONT_GENERATE, DONT_INLINE]
                  0x00be: PHI (r76v11 int) = (r76v4 int), (r76v12 int) binds: [B:56:0x00bc, B:267:0x0416] A[DONT_GENERATE, DONT_INLINE]
                  0x00be: PHI (r77v11 boolean) = (r77v4 boolean), (r77v12 boolean) binds: [B:56:0x00bc, B:267:0x0416] A[DONT_GENERATE, DONT_INLINE]
                  0x00be: PHI (r78v10 long) = (r78v3 long), (r78v11 long) binds: [B:56:0x00bc, B:267:0x0416] A[DONT_GENERATE, DONT_INLINE]
                  0x00be: PHI (r80v9 boolean) = (r80v2 boolean), (r80v10 boolean) binds: [B:56:0x00bc, B:267:0x0416] A[DONT_GENERATE, DONT_INLINE]
                  0x00be: PHI (r81v8 boolean) = (r81v1 boolean), (r81v9 boolean) binds: [B:56:0x00bc, B:267:0x0416] A[DONT_GENERATE, DONT_INLINE]
                  0x00be: PHI (r82v8 X.0Y9l) = (r82v1 X.0Y9l), (r82v9 X.0Y9l) binds: [B:56:0x00bc, B:267:0x0416] A[DONT_GENERATE, DONT_INLINE]
                  0x00be: PHI (r84v7 boolean) = (r84v0 boolean), (r84v8 boolean) binds: [B:56:0x00bc, B:267:0x0416] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:59:0x00c4  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x00d2 A[PHI: r73 r74 r75 r76 r77 r78 r80 r81 r82 r84 r86
                  0x00d2: PHI (r73v11 int) = (r73v9 int), (r73v12 int) binds: [B:265:0x0410, B:63:0x00d0] A[DONT_GENERATE, DONT_INLINE]
                  0x00d2: PHI (r74v11 java.lang.Integer) = (r74v9 java.lang.Integer), (r74v12 java.lang.Integer) binds: [B:265:0x0410, B:63:0x00d0] A[DONT_GENERATE, DONT_INLINE]
                  0x00d2: PHI (r75v10 java.lang.String) = (r75v8 java.lang.String), (r75v11 java.lang.String) binds: [B:265:0x0410, B:63:0x00d0] A[DONT_GENERATE, DONT_INLINE]
                  0x00d2: PHI (r76v9 int) = (r76v7 int), (r76v10 int) binds: [B:265:0x0410, B:63:0x00d0] A[DONT_GENERATE, DONT_INLINE]
                  0x00d2: PHI (r77v9 boolean) = (r77v7 boolean), (r77v10 boolean) binds: [B:265:0x0410, B:63:0x00d0] A[DONT_GENERATE, DONT_INLINE]
                  0x00d2: PHI (r78v8 long) = (r78v6 long), (r78v9 long) binds: [B:265:0x0410, B:63:0x00d0] A[DONT_GENERATE, DONT_INLINE]
                  0x00d2: PHI (r80v7 boolean) = (r80v5 boolean), (r80v8 boolean) binds: [B:265:0x0410, B:63:0x00d0] A[DONT_GENERATE, DONT_INLINE]
                  0x00d2: PHI (r81v6 boolean) = (r81v4 boolean), (r81v7 boolean) binds: [B:265:0x0410, B:63:0x00d0] A[DONT_GENERATE, DONT_INLINE]
                  0x00d2: PHI (r82v6 X.0Y9l) = (r82v4 X.0Y9l), (r82v7 X.0Y9l) binds: [B:265:0x0410, B:63:0x00d0] A[DONT_GENERATE, DONT_INLINE]
                  0x00d2: PHI (r84v5 boolean) = (r84v3 boolean), (r84v6 boolean) binds: [B:265:0x0410, B:63:0x00d0] A[DONT_GENERATE, DONT_INLINE]
                  0x00d2: PHI (r86v4 boolean) = (r86v2 boolean), (r86v5 boolean) binds: [B:265:0x0410, B:63:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:66:0x00d6  */
                /* JADX WARN: Removed duplicated region for block: B:71:0x00e4  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x0100  */
                /* JADX WARN: Removed duplicated region for block: B:79:0x0135  */
                /* JADX WARN: Removed duplicated region for block: B:84:0x0149  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x0159  */
                /* JADX WARN: Removed duplicated region for block: B:89:0x015d  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x0167  */
                /* JADX WARN: Removed duplicated region for block: B:99:0x017b  */
                @Override // X.InterfaceC886490Yq7
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.InterfaceC884440Ymo LIZJ(X.C879540Yeu r94, X.InterfaceC879010Ye3 r95) {
                    /*
                        Method dump skipped, instruction units count: 1116
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C887150YrB.LIZJ(X.0Yeu, X.0Ye3):X.0Ymo");
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C887160YrC.class))) {
            return new AbstractC886890Yql<C0Z8O, C887060Yr2, C0Z8S>() { // from class: X.0YrC
                public final C01GW LIZ = C452501pT.LIZIZ(new C887110Yr7());
                public final String LIZIZ = "group_chat_vo_converter";

                @Override // X.InterfaceC886490Yq7
                public final InterfaceC886910Yqn LIZIZ() {
                    return (AbstractC887250YrL) this.LIZ.getValue();
                }

                @Override // X.InterfaceC886490Yq7
                public final String LIZ() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC886490Yq7
                public final boolean LIZLLL(C879540Yeu<?> c879540Yeu) {
                    return Intrinsics.LJFF(c879540Yeu.LIZ, C1606306Qr.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:100:0x014b A[PHI: r76
                  0x014b: PHI (r76v1 boolean) = (r76v0 boolean), (r76v3 boolean) binds: [B:65:0x00e7, B:59:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:103:0x0152  */
                /* JADX WARN: Removed duplicated region for block: B:108:0x0160  */
                /* JADX WARN: Removed duplicated region for block: B:111:0x016c A[PHI: r81 r82
                  0x016c: PHI (r81v3 int) = (r81v1 int), (r81v4 int) binds: [B:259:0x03ae, B:110:0x016a] A[DONT_GENERATE, DONT_INLINE]
                  0x016c: PHI (r82v2 boolean) = (r82v0 boolean), (r82v3 boolean) binds: [B:259:0x03ae, B:110:0x016a] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:114:0x017e  */
                /* JADX WARN: Removed duplicated region for block: B:119:0x018c  */
                /* JADX WARN: Removed duplicated region for block: B:124:0x01b9  */
                /* JADX WARN: Removed duplicated region for block: B:129:0x01cb  */
                /* JADX WARN: Removed duplicated region for block: B:132:0x01d7  */
                /* JADX WARN: Removed duplicated region for block: B:134:0x01db  */
                /* JADX WARN: Removed duplicated region for block: B:137:0x01e5  */
                /* JADX WARN: Removed duplicated region for block: B:144:0x01f9  */
                /* JADX WARN: Removed duplicated region for block: B:147:0x0205  */
                /* JADX WARN: Removed duplicated region for block: B:152:0x0217  */
                /* JADX WARN: Removed duplicated region for block: B:157:0x0227  */
                /* JADX WARN: Removed duplicated region for block: B:162:0x0237  */
                /* JADX WARN: Removed duplicated region for block: B:167:0x0249  */
                /* JADX WARN: Removed duplicated region for block: B:172:0x0259  */
                /* JADX WARN: Removed duplicated region for block: B:177:0x0269  */
                /* JADX WARN: Removed duplicated region for block: B:182:0x027b  */
                /* JADX WARN: Removed duplicated region for block: B:185:0x0287  */
                /* JADX WARN: Removed duplicated region for block: B:188:0x0293  */
                /* JADX WARN: Removed duplicated region for block: B:193:0x02a3  */
                /* JADX WARN: Removed duplicated region for block: B:196:0x02af  */
                /* JADX WARN: Removed duplicated region for block: B:199:0x02bb  */
                /* JADX WARN: Removed duplicated region for block: B:202:0x02c7  */
                /* JADX WARN: Removed duplicated region for block: B:205:0x02d1  */
                /* JADX WARN: Removed duplicated region for block: B:210:0x02df  */
                /* JADX WARN: Removed duplicated region for block: B:215:0x02ed  */
                /* JADX WARN: Removed duplicated region for block: B:222:0x0303  */
                /* JADX WARN: Removed duplicated region for block: B:225:0x030f  */
                /* JADX WARN: Removed duplicated region for block: B:230:0x0321  */
                /* JADX WARN: Removed duplicated region for block: B:233:0x0359  */
                /* JADX WARN: Removed duplicated region for block: B:234:0x035b  */
                /* JADX WARN: Removed duplicated region for block: B:235:0x035d  */
                /* JADX WARN: Removed duplicated region for block: B:236:0x0360  */
                /* JADX WARN: Removed duplicated region for block: B:237:0x0362  */
                /* JADX WARN: Removed duplicated region for block: B:238:0x0365  */
                /* JADX WARN: Removed duplicated region for block: B:239:0x0368  */
                /* JADX WARN: Removed duplicated region for block: B:240:0x036b  */
                /* JADX WARN: Removed duplicated region for block: B:241:0x036e  */
                /* JADX WARN: Removed duplicated region for block: B:242:0x0371  */
                /* JADX WARN: Removed duplicated region for block: B:243:0x0374  */
                /* JADX WARN: Removed duplicated region for block: B:244:0x0377  */
                /* JADX WARN: Removed duplicated region for block: B:245:0x037a  */
                /* JADX WARN: Removed duplicated region for block: B:246:0x037e  */
                /* JADX WARN: Removed duplicated region for block: B:247:0x0382  */
                /* JADX WARN: Removed duplicated region for block: B:248:0x0386  */
                /* JADX WARN: Removed duplicated region for block: B:249:0x038a  */
                /* JADX WARN: Removed duplicated region for block: B:250:0x038e  */
                /* JADX WARN: Removed duplicated region for block: B:251:0x0392  */
                /* JADX WARN: Removed duplicated region for block: B:252:0x0396  */
                /* JADX WARN: Removed duplicated region for block: B:253:0x0399  */
                /* JADX WARN: Removed duplicated region for block: B:254:0x039c  */
                /* JADX WARN: Removed duplicated region for block: B:255:0x03a3  */
                /* JADX WARN: Removed duplicated region for block: B:256:0x03a7  */
                /* JADX WARN: Removed duplicated region for block: B:257:0x03aa  */
                /* JADX WARN: Removed duplicated region for block: B:260:0x03b0  */
                /* JADX WARN: Removed duplicated region for block: B:261:0x03b3  */
                /* JADX WARN: Removed duplicated region for block: B:27:0x004e  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
                /* JADX WARN: Removed duplicated region for block: B:40:0x0084  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
                /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
                /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
                /* JADX WARN: Removed duplicated region for block: B:52:0x00aa A[PHI: r65 r66 r67 r68 r70 r71 r72 r74
                  0x00aa: PHI (r65v7 java.lang.String) = (r65v5 java.lang.String), (r65v8 java.lang.String) binds: [B:83:0x0107, B:51:0x00a8] A[DONT_GENERATE, DONT_INLINE]
                  0x00aa: PHI (r66v6 int) = (r66v4 int), (r66v7 int) binds: [B:83:0x0107, B:51:0x00a8] A[DONT_GENERATE, DONT_INLINE]
                  0x00aa: PHI (r67v6 boolean) = (r67v4 boolean), (r67v7 boolean) binds: [B:83:0x0107, B:51:0x00a8] A[DONT_GENERATE, DONT_INLINE]
                  0x00aa: PHI (r68v5 long) = (r68v3 long), (r68v6 long) binds: [B:83:0x0107, B:51:0x00a8] A[DONT_GENERATE, DONT_INLINE]
                  0x00aa: PHI (r70v4 boolean) = (r70v2 boolean), (r70v5 boolean) binds: [B:83:0x0107, B:51:0x00a8] A[DONT_GENERATE, DONT_INLINE]
                  0x00aa: PHI (r71v3 boolean) = (r71v1 boolean), (r71v4 boolean) binds: [B:83:0x0107, B:51:0x00a8] A[DONT_GENERATE, DONT_INLINE]
                  0x00aa: PHI (r72v3 X.0Y9l) = (r72v1 X.0Y9l), (r72v4 X.0Y9l) binds: [B:83:0x0107, B:51:0x00a8] A[DONT_GENERATE, DONT_INLINE]
                  0x00aa: PHI (r74v2 boolean) = (r74v0 boolean), (r74v3 boolean) binds: [B:83:0x0107, B:51:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:55:0x00b4  */
                /* JADX WARN: Removed duplicated region for block: B:60:0x00c2  */
                /* JADX WARN: Removed duplicated region for block: B:64:0x00e5  */
                /* JADX WARN: Removed duplicated region for block: B:67:0x00ea  */
                /* JADX WARN: Removed duplicated region for block: B:70:0x00ef A[PHI: r65
                  0x00ef: PHI (r65v1 java.lang.String) = (r65v0 java.lang.String), (r65v12 java.lang.String) binds: [B:68:0x00ec, B:36:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:73:0x00f5 A[PHI: r65 r66 r67
                  0x00f5: PHI (r65v2 java.lang.String) = (r65v1 java.lang.String), (r65v11 java.lang.String) binds: [B:72:0x00f3, B:39:0x0082] A[DONT_GENERATE, DONT_INLINE]
                  0x00f5: PHI (r66v1 int) = (r66v0 int), (r66v10 int) binds: [B:72:0x00f3, B:39:0x0082] A[DONT_GENERATE, DONT_INLINE]
                  0x00f5: PHI (r67v1 boolean) = (r67v0 boolean), (r67v10 boolean) binds: [B:72:0x00f3, B:39:0x0082] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:76:0x00fa A[PHI: r65 r66 r67 r68
                  0x00fa: PHI (r65v3 java.lang.String) = (r65v2 java.lang.String), (r65v10 java.lang.String) binds: [B:74:0x00f7, B:42:0x008c] A[DONT_GENERATE, DONT_INLINE]
                  0x00fa: PHI (r66v2 int) = (r66v1 int), (r66v9 int) binds: [B:74:0x00f7, B:42:0x008c] A[DONT_GENERATE, DONT_INLINE]
                  0x00fa: PHI (r67v2 boolean) = (r67v1 boolean), (r67v9 boolean) binds: [B:74:0x00f7, B:42:0x008c] A[DONT_GENERATE, DONT_INLINE]
                  0x00fa: PHI (r68v1 long) = (r68v0 long), (r68v8 long) binds: [B:74:0x00f7, B:42:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:79:0x00ff A[PHI: r65 r66 r67 r68 r70
                  0x00ff: PHI (r65v4 java.lang.String) = (r65v3 java.lang.String), (r65v9 java.lang.String) binds: [B:77:0x00fc, B:45:0x0094] A[DONT_GENERATE, DONT_INLINE]
                  0x00ff: PHI (r66v3 int) = (r66v2 int), (r66v8 int) binds: [B:77:0x00fc, B:45:0x0094] A[DONT_GENERATE, DONT_INLINE]
                  0x00ff: PHI (r67v3 boolean) = (r67v2 boolean), (r67v8 boolean) binds: [B:77:0x00fc, B:45:0x0094] A[DONT_GENERATE, DONT_INLINE]
                  0x00ff: PHI (r68v2 long) = (r68v1 long), (r68v7 long) binds: [B:77:0x00fc, B:45:0x0094] A[DONT_GENERATE, DONT_INLINE]
                  0x00ff: PHI (r70v1 boolean) = (r70v0 boolean), (r70v6 boolean) binds: [B:77:0x00fc, B:45:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:82:0x0105 A[PHI: r65 r66 r67 r68 r70 r71 r72
                  0x0105: PHI (r65v5 java.lang.String) = (r65v4 java.lang.String), (r65v8 java.lang.String), (r65v8 java.lang.String) binds: [B:81:0x0103, B:48:0x00a0, B:50:0x00a6] A[DONT_GENERATE, DONT_INLINE]
                  0x0105: PHI (r66v4 int) = (r66v3 int), (r66v7 int), (r66v7 int) binds: [B:81:0x0103, B:48:0x00a0, B:50:0x00a6] A[DONT_GENERATE, DONT_INLINE]
                  0x0105: PHI (r67v4 boolean) = (r67v3 boolean), (r67v7 boolean), (r67v7 boolean) binds: [B:81:0x0103, B:48:0x00a0, B:50:0x00a6] A[DONT_GENERATE, DONT_INLINE]
                  0x0105: PHI (r68v3 long) = (r68v2 long), (r68v6 long), (r68v6 long) binds: [B:81:0x0103, B:48:0x00a0, B:50:0x00a6] A[DONT_GENERATE, DONT_INLINE]
                  0x0105: PHI (r70v2 boolean) = (r70v1 boolean), (r70v5 boolean), (r70v5 boolean) binds: [B:81:0x0103, B:48:0x00a0, B:50:0x00a6] A[DONT_GENERATE, DONT_INLINE]
                  0x0105: PHI (r71v1 boolean) = (r71v0 boolean), (r71v4 boolean), (r71v4 boolean) binds: [B:81:0x0103, B:48:0x00a0, B:50:0x00a6] A[DONT_GENERATE, DONT_INLINE]
                  0x0105: PHI (r72v1 X.0Y9l) = (r72v0 X.0Y9l), (r72v4 X.0Y9l), (r72v4 X.0Y9l) binds: [B:81:0x0103, B:48:0x00a0, B:50:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:84:0x0109  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x010b  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x010f  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x0114  */
                /* JADX WARN: Removed duplicated region for block: B:91:0x011e A[PHI: r59
                  0x011e: PHI (r59v1 boolean) = (r59v0 boolean), (r59v3 boolean), (r59v3 boolean) binds: [B:89:0x011a, B:17:0x002f, B:19:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // X.InterfaceC886490Yq7
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.InterfaceC884440Ymo LIZJ(X.C879540Yeu r87, X.InterfaceC879010Ye3 r88) {
                    /*
                        Method dump skipped, instruction units count: 951
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C887160YrC.LIZJ(X.0Yeu, X.0Ye3):X.0Ymo");
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C887180YrE.class))) {
            return new AbstractC886890Yql<C887190YrF, C887260YrM, C0Z3U>() { // from class: X.0YrE
                public final C01GW LIZ = C452501pT.LIZIZ(new C887350YrV());
                public final String LIZIZ = "message_request_entrance_vo_converter";

                @Override // X.InterfaceC886490Yq7
                public final InterfaceC886910Yqn LIZIZ() {
                    return (AbstractC887250YrL) this.LIZ.getValue();
                }

                @Override // X.InterfaceC886490Yq7
                public final String LIZ() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC886490Yq7
                public final boolean LIZLLL(C879540Yeu<?> c879540Yeu) {
                    return Intrinsics.LJFF(c879540Yeu.LIZ, C878910Ydt.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC886490Yq7
                public final InterfaceC884440Ymo LIZJ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
                    C879950YfZ c879950YfZ;
                    String str;
                    long j;
                    int i;
                    long jLongValue;
                    AbstractC884010Ym7 abstractC884010Ym7;
                    String str2;
                    C882220YjE c882220YjE;
                    String str3;
                    C879940YfY c879940YfY;
                    C880740Ygq c880740Ygq;
                    CharSequence charSequence;
                    Long l;
                    C879940YfY c879940YfY2;
                    Map<InterfaceC887040Yr0<?>, Object> mapLIZ = C886500Yq8.LIZ(this, c879540Yeu);
                    T t = c879540Yeu.LIZJ;
                    AbstractC884010Ym7 abstractC884010Ym72 = null;
                    if (t instanceof C879950YfZ) {
                        c879950YfZ = (C879950YfZ) t;
                    } else {
                        c879950YfZ = null;
                    }
                    if (c879950YfZ != null) {
                        str = c879950YfZ.LIZ;
                    } else {
                        str = null;
                    }
                    CharSequence charSequence2 = "";
                    if (str == null) {
                        str = "";
                    }
                    C887410Yrb c887410Yrb = C887410Yrb.LIZ;
                    LinkedHashMap linkedHashMap = (LinkedHashMap) mapLIZ;
                    Object obj = linkedHashMap.get(c887410Yrb);
                    if ((obj instanceof C879940YfY) && (c879940YfY2 = (C879940YfY) obj) != null) {
                        j = c879940YfY2.LIZIZ;
                    } else {
                        j = 0;
                    }
                    if (c879950YfZ != null) {
                        i = c879950YfZ.LJI;
                    } else {
                        i = 0;
                    }
                    C0Z3U c0z3u = new C0Z3U(2, 107, str, false, false, false, j, i);
                    InterfaceC1490905sZ<T> interfaceC1490905sZ = c879540Yeu.LIZ;
                    InterfaceC1491305sd interfaceC1491305sd = c879540Yeu.LIZIZ;
                    Object obj2 = linkedHashMap.get(C887420Yrc.LIZ);
                    if ((obj2 instanceof Long) && (l = (Long) obj2) != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = Long.MAX_VALUE;
                    }
                    C886990Yqv c886990Yqv = C886990Yqv.LIZ;
                    Object obj3 = linkedHashMap.get(c886990Yqv);
                    if (obj3 instanceof AbstractC884010Ym7) {
                        abstractC884010Ym7 = (AbstractC884010Ym7) obj3;
                    } else {
                        abstractC884010Ym7 = null;
                    }
                    Object obj4 = linkedHashMap.get(C886930Yqp.LIZ);
                    if (!(obj4 instanceof String) || (str2 = (String) obj4) == null) {
                        str2 = "";
                    }
                    Object obj5 = linkedHashMap.get(C887380YrY.LIZ);
                    if ((obj5 instanceof C880740Ygq) && (c880740Ygq = (C880740Ygq) obj5) != null && (charSequence = c880740Ygq.LIZ) != null) {
                        charSequence2 = charSequence;
                    }
                    Object obj6 = linkedHashMap.get(C887440Yre.LIZ);
                    if (obj6 instanceof C882220YjE) {
                        c882220YjE = (C882220YjE) obj6;
                    } else {
                        c882220YjE = null;
                    }
                    Object obj7 = linkedHashMap.get(c887410Yrb);
                    if ((obj7 instanceof C879940YfY) && (c879940YfY = (C879940YfY) obj7) != null) {
                        str3 = c879940YfY.LIZ;
                    } else {
                        str3 = null;
                    }
                    Object obj8 = linkedHashMap.get(c886990Yqv);
                    if (obj8 instanceof AbstractC884010Ym7) {
                        abstractC884010Ym72 = (AbstractC884010Ym7) obj8;
                    }
                    return new C887190YrF(interfaceC879010Ye3, interfaceC1490905sZ, interfaceC1491305sd, jLongValue, abstractC884010Ym7, str2, charSequence2, c882220YjE, str3, !C880320YgA.LIZ(abstractC884010Ym72), c0z3u);
                }
            };
        }
        return null;
    }

    public static InterfaceC884950Ynd LJIIJ(C13IQ c13iq) {
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C0Z8Q.class))) {
            return new C0Z8Q();
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C0Z8K.class))) {
            return new InterfaceC884950Ynd() { // from class: X.0Z8K
                public static final /* synthetic */ int LIZ = 0;

                @Override // X.InterfaceC884950Ynd
                public final void LIZJ() {
                }

                @Override // X.InterfaceC884950Ynd
                public final void init() {
                }

                public static Context LJ() {
                    Activity activityLIZIZ;
                    AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
                    return (abstractC1387200mCcLIZIZ == null || (activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ()) == null) ? C1383370m6R.LIZ : activityLIZIZ;
                }

                public static CharSequence LIZIZ(Context context) {
                    String strLJJIFFI = u.LJJIFFI(context.getString(2131858484), "%1$s", "\u200d", false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strLJJIFFI);
                    C419910GdJ c419910GdJ = new C419910GdJ();
                    c419910GdJ.LIZ = R.raw.icon_whee_text_logo;
                    c419910GdJ.LJ = Integer.valueOf(R.attr.a1k);
                    c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(35));
                    c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14));
                    C419890GdH c419890GdHLIZIZ = c419910GdJ.LIZIZ(2, context);
                    int iLJJJ = a0.LJJJ(strLJJIFFI, "\u200d", 0, false, 6);
                    if (iLJJJ >= 0) {
                        C786410Ut5.q2(spannableStringBuilder, c419890GdHLIZIZ, iLJJJ, iLJJJ + 1, 33);
                    }
                    return spannableStringBuilder;
                }

                public static CharSequence LIZLLL(C0I3B c0i3b) {
                    int iIntValue;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (c0i3b != null) {
                        Context context = C1383370m6R.LIZ;
                        String string = context.getString(2131828571);
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context);
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = -1;
                        }
                        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(iIntValue);
                        spannableStringBuilder.append((CharSequence) string);
                        C786410Ut5.q2(spannableStringBuilder, foregroundColorSpan, 0, string.length(), 17);
                        if (C123100dR.LIZ(c0i3b.draftContent)) {
                            spannableStringBuilder.append((CharSequence) " ");
                            spannableStringBuilder.length();
                            spannableStringBuilder.append((CharSequence) c0i3b.draftContent);
                        }
                    }
                    return spannableStringBuilder;
                }

                public static C1231904rt LJFF(String str) {
                    if (str != null && C123100dR.LIZ(str) && str != null) {
                        return new C1231904rt(str);
                    }
                    return null;
                }

                public static boolean LJII(C0I3B c0i3b) {
                    if (c0i3b != null) {
                        if (!C123100dR.LIZ(c0i3b.draftContent)) {
                            Long l = c0i3b.quotedMessageId;
                            if ((l != null && l.longValue() != 0) || C866950Xzh.LIZIZ(c0i3b.richTextInfoList)) {
                                return true;
                            }
                            return false;
                        }
                        return true;
                    }
                    return false;
                }

                @Override // X.InterfaceC884950Ynd
                public final void LIZ(InterfaceC884440Ymo interfaceC884440Ymo, InterfaceC879010Ye3 interfaceC879010Ye3, boolean z) {
                    FilterTabType filterTabType;
                    boolean z2;
                    C0Z8A c892460Yzk;
                    int i;
                    String str;
                    C878950Ydx c878950Ydx;
                    if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null) {
                        filterTabType = c878950Ydx.LLILLL;
                    } else {
                        filterTabType = null;
                    }
                    if (interfaceC884440Ymo instanceof C0Z8N) {
                        C0Z8N c0z8n = (C0Z8N) interfaceC884440Ymo;
                        VOLightInteractionEntryConf lightInteractionEntryConf = c0z8n.getLightInteractionEntryConf();
                        boolean zIsBlock = c0z8n.getExtra().isBlock();
                        Integer unreadCountForContentPrefix = c0z8n.getExtra().getUnreadCountForContentPrefix();
                        String sayHiContent = c0z8n.getSayHiContent();
                        CharSequence content = c0z8n.getContent();
                        String contentType = c0z8n.getExtra().getContentType();
                        boolean zIsBlocked = c0z8n.getExtra().isBlocked();
                        SystemContent systemContentOfLastMsg = c0z8n.getSystemContentOfLastMsg();
                        C0I3B msgDraft = c0z8n.getMsgDraft();
                        InterfaceC894890Z8t typingIndicatorInboxData = c0z8n.getTypingIndicatorInboxData();
                        if (typingIndicatorInboxData == null) {
                            typingIndicatorInboxData = C1517105wn.LIZ;
                        }
                        c0z8n.setVoContentType(LJI(filterTabType, lightInteractionEntryConf, zIsBlock, unreadCountForContentPrefix, sayHiContent, content, contentType, zIsBlocked, systemContentOfLastMsg, msgDraft, typingIndicatorInboxData, c0z8n.isShowingTypingStatus(), c0z8n.getTypingStatusText(), c0z8n.getExtra().getLastMsgSendBySelf(), c0z8n.isLastMsgFakeMsg(), c0z8n.getShowingReactionContent(), C880320YgA.LIZ(c0z8n.getUnreadViewState()), c0z8n.getActivityText(), c0z8n.getRecentActivity(), c0z8n.getStoryFriendAnniversary(), c0z8n.getExtra().isMute(), c0z8n.getReadStatus(), c0z8n.getReadText(), c0z8n.getExtra().getLastMsgCreatedAt(), c0z8n.getExtra().getLastMsgRecalled(), c0z8n.getActivityStatusTextWithType(), c0z8n.getThoughtBubble()));
                        return;
                    }
                    if (interfaceC884440Ymo instanceof C0Z8O) {
                        C0Z8O c0z8o = (C0Z8O) interfaceC884440Ymo;
                        String activityText = c0z8o.getActivityText();
                        boolean zIsValid = c0z8o.getExtra().isValid();
                        boolean zIsBanned = c0z8o.getExtra().isBanned();
                        boolean zIsMember = c0z8o.getExtra().isMember();
                        CharSequence content2 = c0z8o.getContent();
                        String contentType2 = c0z8o.getExtra().getContentType();
                        C0I3B msgDraft2 = c0z8o.getMsgDraft();
                        InterfaceC894890Z8t typingIndicatorInboxData2 = c0z8o.getTypingIndicatorInboxData();
                        if (typingIndicatorInboxData2 == null) {
                            typingIndicatorInboxData2 = C1517105wn.LIZ;
                        }
                        CharSequence readText = c0z8o.getReadText();
                        boolean zLJJJJ = C13LP.LJJJJ(c0z8o.getExtra().getLastMessageScene(), C1697810uHb.LJIIJJI("streak_group_end_no_restore", "streak_group_recover", "streak_group_end_with_restore", "streak_group_upgrade", "streak_group_unlock"));
                        boolean showReadStatus = c0z8o.getShowReadStatus();
                        C894700Z8a activityStatusTextWithType = c0z8o.getActivityStatusTextWithType();
                        boolean zIsMute = c0z8o.getExtra().isMute();
                        EnumC881770YiV readStatus = c0z8o.getReadStatus();
                        if (C123100dR.LIZ(activityText) && zIsValid) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        String string = "";
                        if (!zIsBanned && zIsMember) {
                            if (LJII(msgDraft2)) {
                                c892460Yzk = new C1232304rx(LIZLLL(msgDraft2));
                            } else if (!(typingIndicatorInboxData2 instanceof C1517105wn)) {
                                String strLIZ = typingIndicatorInboxData2.LIZ();
                                if (strLIZ != null) {
                                    c892460Yzk = new C1232204rw(strLIZ);
                                } else {
                                    c892460Yzk = new C892460Yzk(content2, contentType2);
                                }
                            } else if (readText != null && readText.length() > 0 && showReadStatus) {
                                c892460Yzk = new C891940Yyu(readText, readStatus);
                            } else if (zLJJJJ) {
                                c892460Yzk = new C892460Yzk(content2, contentType2);
                            } else if (z2) {
                                if (activityStatusTextWithType != null) {
                                    str = activityStatusTextWithType.LIZLLL;
                                } else {
                                    str = null;
                                }
                                if (C123100dR.LIZ(str)) {
                                    IMContactApi.LIZ.getClass();
                                    IMUser iMUserLJIIL = C069P.LIZ().LJ().LJIIL(str, null, "im_local_db");
                                    if (iMUserLJIIL != null) {
                                        Context contextLJ = LJ();
                                        String strLIZ2 = C1247000iYU.LIZ(iMUserLJIIL);
                                        if (strLIZ2 == null && (strLIZ2 = iMUserLJIIL.getNickName()) == null) {
                                            strLIZ2 = "";
                                        }
                                        int i2 = C896510ZEz.LIZ[activityStatusTextWithType.LIZIZ.ordinal()];
                                        if (i2 != 1) {
                                            if (i2 != 3) {
                                                if (i2 == 4) {
                                                    string = contextLJ.getString(2131835260, strLIZ2);
                                                }
                                            } else {
                                                string = contextLJ.getString(2131835259, strLIZ2, Integer.valueOf(activityStatusTextWithType.LJ));
                                            }
                                        } else {
                                            string = contextLJ.getString(2131835257, strLIZ2);
                                        }
                                        c892460Yzk = new C1273004yW(string, activityStatusTextWithType.LIZJ);
                                    } else {
                                        c892460Yzk = new C892460Yzk(content2, contentType2);
                                    }
                                } else {
                                    EnumC894710Z8b enumC894710Z8b = null;
                                    if (C123100dR.LIZ(activityText)) {
                                        if (activityStatusTextWithType != null) {
                                            enumC894710Z8b = activityStatusTextWithType.LIZJ;
                                        }
                                        c892460Yzk = new C1273004yW(activityText, enumC894710Z8b);
                                    } else {
                                        c892460Yzk = new C892460Yzk(content2, contentType2);
                                    }
                                }
                            } else if (!zIsMute && filterTabType != FilterTabType.SPAM && readStatus != null && (((i = C892440Yzi.LIZIZ[readStatus.ordinal()]) == 1 || i == 2) && readText != null && readText.length() > 0)) {
                                c892460Yzk = new C891940Yyu(readText, readStatus);
                            } else {
                                c892460Yzk = new C892460Yzk(content2, contentType2);
                            }
                        } else if (C13LP.LJJJJ(readStatus, C1697810uHb.LJIIJJI(EnumC881770YiV.FAILED, EnumC881770YiV.SENDING))) {
                            if (readText != null && readText.length() > 0) {
                                c892460Yzk = new C891940Yyu(readText, readStatus);
                            } else {
                                c892460Yzk = new C892460Yzk("", contentType2);
                            }
                        } else {
                            c892460Yzk = new C892460Yzk(content2, contentType2);
                        }
                        c0z8o.setVoContentType(c892460Yzk);
                        return;
                    }
                    if (!(interfaceC884440Ymo instanceof C0Z8R)) {
                        return;
                    }
                    C0Z8R c0z8r = (C0Z8R) interfaceC884440Ymo;
                    boolean zIsBlock2 = c0z8r.getExtra().isBlock();
                    Integer unreadCountForContentPrefix2 = c0z8r.getExtra().getUnreadCountForContentPrefix();
                    CharSequence content3 = c0z8r.getContent();
                    String contentType3 = c0z8r.getExtra().getContentType();
                    boolean zIsBlocked2 = c0z8r.getExtra().isBlocked();
                    SystemContent systemContentOfLastMsg2 = c0z8r.getSystemContentOfLastMsg();
                    C0I3B msgDraft3 = c0z8r.getMsgDraft();
                    InterfaceC894890Z8t typingIndicatorInboxData3 = c0z8r.getTypingIndicatorInboxData();
                    if (typingIndicatorInboxData3 == null) {
                        typingIndicatorInboxData3 = C1517105wn.LIZ;
                    }
                    c0z8r.setVoContentType(LJI(filterTabType, null, zIsBlock2, unreadCountForContentPrefix2, null, content3, contentType3, zIsBlocked2, systemContentOfLastMsg2, msgDraft3, typingIndicatorInboxData3, c0z8r.isShowingTypingStatus(), c0z8r.getTypingStatusText(), c0z8r.getExtra().getLastMsgSendBySelf(), false, false, C880320YgA.LIZ(c0z8r.getUnreadViewState()), null, null, null, c0z8r.getExtra().isMute(), c0z8r.getReadStatus(), c0z8r.getReadText(), c0z8r.getExtra().getLastMsgCreatedAt(), c0z8r.getExtra().getLastMsgRecalled(), null, null));
                }

                /* JADX WARN: Code restructure failed: missing block: B:42:0x0083, code lost:
                
                    if (com.bytedance.keva.Keva.getRepo("im_say_hi_sticker_seen_repo").getInt(r2, 0) > 3) goto L43;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
                /* JADX WARN: Type inference failed for: r1v15 */
                /* JADX WARN: Type inference failed for: r1v16 */
                /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.CharSequence] */
                /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.CharSequence] */
                /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.CharSequence] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public static X.C0Z8A LJI(com.ss.android.ugc.aweme.inbox.filter.FilterTabType r9, com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VOLightInteractionEntryConf r10, boolean r11, java.lang.Integer r12, java.lang.String r13, java.lang.CharSequence r14, java.lang.String r15, boolean r16, com.ss.android.ugc.aweme.im.message.content.SystemContent r17, X.C0I3B r18, X.InterfaceC894890Z8t r19, boolean r20, java.lang.CharSequence r21, boolean r22, boolean r23, boolean r24, boolean r25, java.lang.String r26, X.C1722406oo r27, com.ss.android.ugc.aweme.im.common.model.RelationshipCelebrationTarget r28, boolean r29, X.EnumC881770YiV r30, java.lang.CharSequence r31, long r32, boolean r34, X.C894700Z8a r35, com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo r36) {
                    /*
                        Method dump skipped, instruction units count: 593
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0Z8K.LJI(com.ss.android.ugc.aweme.inbox.filter.FilterTabType, com.ss.android.ugc.aweme.im.chatlist.api.adapter.vo.rightview.VOLightInteractionEntryConf, boolean, java.lang.Integer, java.lang.String, java.lang.CharSequence, java.lang.String, boolean, com.ss.android.ugc.aweme.im.message.content.SystemContent, X.0I3B, X.0Z8t, boolean, java.lang.CharSequence, boolean, boolean, boolean, boolean, java.lang.String, X.06oo, com.ss.android.ugc.aweme.im.common.model.RelationshipCelebrationTarget, boolean, X.0YiV, java.lang.CharSequence, long, boolean, X.0Z8a, com.ss.android.ugc.aweme.social.thought.api.model.ThoughtInfo):X.0Z8A");
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C0Z8V.class))) {
            return new InterfaceC884950Ynd() { // from class: X.0Z8V
                @Override // X.InterfaceC884950Ynd
                public final void LIZJ() {
                }

                @Override // X.InterfaceC884950Ynd
                public final void init() {
                }

                public static String LIZLLL(Context context, String str) {
                    C296870BkL.LIZ.getClass();
                    long jLongValue = 0;
                    if (C296870BkL.LIZ()) {
                        if (str != null) {
                            Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
                            if (lLJIILIIL != null) {
                                jLongValue = lLJIILIIL.longValue();
                            }
                            String strLIZJ = C2215101Bmm.LIZJ(jLongValue);
                            if (strLIZJ != null) {
                                return strLIZJ;
                            }
                        }
                        return "";
                    }
                    C1866820ygC.LIZ.getClass();
                    if (C1866820ygC.LIZ()) {
                        if (str != null) {
                            Long lLJIILIIL2 = C2095008Iq.LJIILIIL(str);
                            if (lLJIILIIL2 != null) {
                                jLongValue = lLJIILIIL2.longValue();
                            }
                            String strLIZIZ = C2215101Bmm.LIZIZ(jLongValue, C1866820ygC.LIZIZ());
                            if (strLIZIZ != null) {
                                return strLIZIZ;
                            }
                        }
                        return "";
                    }
                    if (str != null) {
                        Long lLJIILIIL3 = C2095008Iq.LJIILIIL(str);
                        if (lLJIILIIL3 != null) {
                            jLongValue = lLJIILIIL3.longValue();
                        }
                        String strLJ = C1356610lPH.LJ(jLongValue, context);
                        if (strLJ != null) {
                            return strLJ;
                        }
                    }
                    return "";
                }

                @Override // X.InterfaceC884950Ynd
                public final void LIZ(InterfaceC884440Ymo interfaceC884440Ymo, InterfaceC879010Ye3 interfaceC879010Ye3, boolean z) {
                    if (interfaceC884440Ymo instanceof C0Z8N) {
                        C0Z8N c0z8n = (C0Z8N) interfaceC884440Ymo;
                        c0z8n.setTimestamp(LIZIZ(c0z8n.getVoContentType(), c0z8n.getMsgDraft(), c0z8n.getReadStatus(), c0z8n.isLastMsgFakeMsg(), c0z8n.getExtra().getLastMsgRecalled(), c0z8n.getExtra().getLastMsgSendBySelf(), c0z8n.getSessionUpdateTime(), C2213981Bky.LIZIZ.getApplicationContext()));
                    } else if (interfaceC884440Ymo instanceof C0Z8O) {
                        C0Z8O c0z8o = (C0Z8O) interfaceC884440Ymo;
                        c0z8o.setTimestamp(LIZIZ(c0z8o.getVoContentType(), c0z8o.getMsgDraft(), c0z8o.getReadStatus(), c0z8o.isLastMsgFakeMsg(), c0z8o.getExtra().getLastMsgRecalled(), c0z8o.getExtra().getLastMsgSendBySelf(), c0z8o.getSessionUpdateTime(), C2213981Bky.LIZIZ.getApplicationContext()));
                    } else {
                        if (!(interfaceC884440Ymo instanceof C0Z8R)) {
                            return;
                        }
                        C0Z8R c0z8r = (C0Z8R) interfaceC884440Ymo;
                        c0z8r.setTimestamp(LIZIZ(c0z8r.getVoContentType(), c0z8r.getMsgDraft(), c0z8r.getReadStatus(), false, c0z8r.getExtra().getLastMsgRecalled(), c0z8r.getExtra().getLastMsgSendBySelf(), c0z8r.getSessionUpdateTime(), C2213981Bky.LIZIZ.getApplicationContext()));
                    }
                }

                public static String LIZIZ(C0Z8A c0z8a, C0I3B c0i3b, EnumC881770YiV enumC881770YiV, boolean z, boolean z2, boolean z3, String str, Context context) {
                    Long l;
                    String strLJ;
                    Long l2;
                    String strLIZIZ;
                    Long l3;
                    String strLIZJ;
                    if (c0z8a instanceof C1232304rx) {
                        C296870BkL.LIZ.getClass();
                        if (C296870BkL.LIZ()) {
                            if (c0i3b != null && (l3 = c0i3b.createTime) != null && (strLIZJ = C2215101Bmm.LIZJ(l3.longValue())) != null) {
                                return strLIZJ;
                            }
                        } else {
                            C1866820ygC.LIZ.getClass();
                            if (C1866820ygC.LIZ()) {
                                if (c0i3b != null && (l2 = c0i3b.createTime) != null && (strLIZIZ = C2215101Bmm.LIZIZ(l2.longValue(), C1866820ygC.LIZIZ())) != null) {
                                    return strLIZIZ;
                                }
                            } else if (c0i3b != null && (l = c0i3b.createTime) != null && (strLJ = C1356610lPH.LJ(l.longValue(), context)) != null) {
                                return strLJ;
                            }
                        }
                    } else if (((c0z8a instanceof C892460Yzk) || ((c0z8a instanceof C891940Yyu) && enumC881770YiV == EnumC881770YiV.FAILED)) && !z) {
                        if (((Number) C270410Ail.LIZ.getValue()).intValue() == 1) {
                            if (!z2 || !z3) {
                                return LIZLLL(context, str);
                            }
                        } else if (!z2) {
                            return LIZLLL(context, str);
                        }
                    }
                    return "";
                }
            };
        }
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C0Z8I.class))) {
            return new InterfaceC884950Ynd() { // from class: X.0Z8I
                @Override // X.InterfaceC884950Ynd
                public final void LIZJ() {
                }

                @Override // X.InterfaceC884950Ynd
                public final void init() {
                }

                @Override // X.InterfaceC884950Ynd
                public final void LIZ(InterfaceC884440Ymo interfaceC884440Ymo, InterfaceC879010Ye3 interfaceC879010Ye3, boolean z) {
                    FilterTabType filterTabType;
                    boolean z2;
                    boolean z3;
                    boolean z4;
                    VORightOperationType c0z8b;
                    boolean z5;
                    boolean z6;
                    C878950Ydx c878950Ydx;
                    List<String> list = null;
                    if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null) {
                        filterTabType = c878950Ydx.LLILLL;
                    } else {
                        filterTabType = null;
                    }
                    boolean z7 = false;
                    if (interfaceC884440Ymo instanceof C0Z8N) {
                        C0Z8N c0z8n = (C0Z8N) interfaceC884440Ymo;
                        VOLightInteractionEntryConf lightInteractionEntryConf = c0z8n.getLightInteractionEntryConf();
                        String sessionId = c0z8n.getExtra().getSessionId();
                        AbstractC884010Ym7 unreadViewState = c0z8n.getUnreadViewState();
                        boolean zIsMute = c0z8n.getExtra().isMute();
                        boolean zIsBlock = c0z8n.getExtra().isBlock();
                        c0z8n.getExtra().isBlocked();
                        C887540Yro chatListCameraStatus = c0z8n.getChatListCameraStatus();
                        if (chatListCameraStatus != null) {
                            z5 = chatListCameraStatus.LIZ;
                        } else {
                            z5 = false;
                        }
                        C887540Yro chatListCameraStatus2 = c0z8n.getChatListCameraStatus();
                        if (chatListCameraStatus2 != null) {
                            z6 = chatListCameraStatus2.LIZIZ;
                        } else {
                            z6 = false;
                        }
                        C887540Yro chatListCameraStatus3 = c0z8n.getChatListCameraStatus();
                        if (chatListCameraStatus3 != null) {
                            list = chatListCameraStatus3.LIZJ;
                        }
                        c0z8n.setRightOperationType(LIZIZ(filterTabType, z5, lightInteractionEntryConf, sessionId, unreadViewState, zIsMute, zIsBlock, z6, list));
                        return;
                    }
                    if (interfaceC884440Ymo instanceof C0Z8O) {
                        C0Z8O c0z8o = (C0Z8O) interfaceC884440Ymo;
                        VOLightInteractionEntryConf lightInteractionEntryConf2 = c0z8o.getLightInteractionEntryConf();
                        boolean hasUnreadMention = c0z8o.getExtra().getHasUnreadMention();
                        boolean zIsMute2 = c0z8o.getExtra().isMute();
                        AbstractC884010Ym7 unreadViewState2 = c0z8o.getUnreadViewState();
                        C887540Yro chatListCameraStatus4 = c0z8o.getChatListCameraStatus();
                        if (chatListCameraStatus4 != null) {
                            z2 = chatListCameraStatus4.LIZ;
                        } else {
                            z2 = false;
                        }
                        C887540Yro chatListCameraStatus5 = c0z8o.getChatListCameraStatus();
                        if (chatListCameraStatus5 != null) {
                            z3 = chatListCameraStatus5.LIZIZ;
                        } else {
                            z3 = false;
                        }
                        C887540Yro chatListCameraStatus6 = c0z8o.getChatListCameraStatus();
                        if (chatListCameraStatus6 != null) {
                            list = chatListCameraStatus6.LIZJ;
                        }
                        if (filterTabType == FilterTabType.SPAM) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (lightInteractionEntryConf2 != null && !z4) {
                            c0z8b = new C0Z8H(lightInteractionEntryConf2);
                        } else if (hasUnreadMention) {
                            if (zIsMute2 || z4) {
                                z7 = true;
                            }
                            c0z8b = new C0Z8F(z7, unreadViewState2);
                        } else if (z3 && list != null && !list.isEmpty()) {
                            c0z8b = C894870Z8r.INSTANCE;
                        } else if (unreadViewState2 != null) {
                            c0z8b = new C0Z8B(unreadViewState2);
                        } else if (z2) {
                            c0z8b = C894860Z8q.INSTANCE;
                        } else {
                            c0z8b = C0Z78.INSTANCE;
                        }
                        c0z8o.setRightOperationType(c0z8b);
                        return;
                    }
                    if (!(interfaceC884440Ymo instanceof C0Z8R)) {
                        return;
                    }
                    C0Z8R c0z8r = (C0Z8R) interfaceC884440Ymo;
                    String sessionId2 = c0z8r.getExtra().getSessionId();
                    AbstractC884010Ym7 unreadViewState3 = c0z8r.getUnreadViewState();
                    boolean zIsMute3 = c0z8r.getExtra().isMute();
                    boolean zIsBlock2 = c0z8r.getExtra().isBlock();
                    c0z8r.getExtra().isBlocked();
                    c0z8r.setRightOperationType(LIZIZ(filterTabType, false, null, sessionId2, unreadViewState3, zIsMute3, zIsBlock2, false, null));
                }

                public static VORightOperationType LIZIZ(FilterTabType filterTabType, boolean z, VOLightInteractionEntryConf vOLightInteractionEntryConf, String str, AbstractC884010Ym7 abstractC884010Ym7, boolean z2, boolean z3, boolean z4, List list) {
                    if (filterTabType == FilterTabType.SPAM) {
                        return C0Z78.INSTANCE;
                    }
                    if (vOLightInteractionEntryConf != null) {
                        String str2 = vOLightInteractionEntryConf.interactionName;
                        if (str2 != null && u.LJJIIJZLJL(str2, "say_hi", false)) {
                            C1336205Ku.LIZ(false).getImSayHiService().LJIIL(str);
                        }
                        return new C0Z8H(vOLightInteractionEntryConf);
                    }
                    if (z4 && list != null && !list.isEmpty()) {
                        return C894870Z8r.INSTANCE;
                    }
                    if (abstractC884010Ym7 != null && !z2 && !z3) {
                        return new C0Z8B(abstractC884010Ym7);
                    }
                    if (z) {
                        return C894860Z8q.INSTANCE;
                    }
                    return C0Z78.INSTANCE;
                }
            };
        }
        return null;
    }

    public static boolean LJI(FilterTabType filterTabType, Set set) {
        if (filterTabType == LIZLLL().LLILLL && Intrinsics.LJFF(set, LIZLLL().LLILZ)) {
            return true;
        }
        return false;
    }
}
