package X;

import com.aweme.ttkvstorage.UpdateRegisterKeyImpl;
import com.bytedance.ies.ugc.ttkvstorageapi.IUpdateKVRegisterKey;
import com.bytedance.ies.ugc.ttkvstorageapi.IUserAccount;
import com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1ArE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192381ArE {
    public final String LIZ;
    public final C589160N8w LIZIZ;
    public final String LIZJ;
    public final EnumC20429814wq LIZLLL = EnumC20429814wq.KEVA;
    public final EnumC19365010pU LJ = EnumC19365010pU.SINGLE_PROCESS;

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC625970Ogt LIZ() {
        final InterfaceC625970Ogt interfaceC625970Ogt;
        String strLIZ;
        final String str = Intrinsics.LJFF(this.LIZ, "global") ? null : this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str2 = "";
        sbLIZ.append(str == null ? "" : str);
        C589160N8w c589160N8w = this.LIZIZ;
        if (c589160N8w != null && (strLIZ = c589160N8w.LIZ("")) != null) {
            str2 = strLIZ;
        }
        sbLIZ.append(str2);
        sbLIZ.append(this.LIZLLL.name());
        sbLIZ.append(this.LIZJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C2192401ArG.LIZ.getClass();
        InterfaceC625970Ogt interfaceC625970Ogt2 = C2192401ArG.LIZIZ.get(strLIZIZ);
        if (interfaceC625970Ogt2 != null) {
            return interfaceC625970Ogt2;
        }
        C259800zU c259800zU = new C259800zU();
        C2192391ArF c2192391ArF = new C2192391ArF(this, c259800zU);
        C2188851AlX c2188851AlX = C2188841AlW.LIZLLL;
        c2192391ArF.invoke(c2188851AlX);
        C2192441ArK c2192441ArK = new C2192441ArK(str, c2188851AlX);
        if (str != null) {
            C2192431ArJ c2192431ArJ = (C2192431ArJ) c259800zU.element;
            C2192351ArB c2192351ArB = C2192351ArB.LIZ;
            String str3 = this.LIZJ;
            EnumC20429814wq enumC20429814wq = this.LIZLLL;
            c2192351ArB.getClass();
            HashMap mapLIZ = C2192351ArB.LIZ(str3, enumC20429814wq);
            if (mapLIZ != null && c2192431ArJ != null) {
                int iLIZJ = C2192411ArH.LIZJ(c2192431ArJ);
                c2192431ArJ.LIZJ = this.LIZLLL == EnumC20429814wq.KEVA ? new C20344314j3(iLIZJ, null, this.LIZJ, null) : new C20448014zm(iLIZJ, null, this.LIZJ, null);
                c2192431ArJ.LIZLLL = (C2192371ArD) mapLIZ.get(this.LIZJ);
            }
        }
        final C589160N8w c589160N8w2 = this.LIZIZ;
        final String str4 = this.LIZJ;
        C2192481ArO c2192481ArO = new C2192481ArO();
        C2192431ArJ c2192431ArJ2 = c2188851AlX.LIZ;
        final C2192431ArJ c2192431ArJ3 = new C2192431ArJ(c2192431ArJ2.LIZ, c2192431ArJ2.LIZIZ, c2192431ArJ2.LIZJ, c2192431ArJ2.LIZLLL, c2192431ArJ2.LJ);
        c2192481ArO.getClass();
        c2188851AlX.getClass();
        C2192471ArN c2192471ArN = new C2192471ArN(c2192431ArJ3.LJ.LIZ(c2192441ArK.LIZIZ, c589160N8w2, str, str4));
        c2192441ArK.LIZJ = c2192471ArN;
        if (str != null) {
            C2192431ArJ c2192431ArJ4 = c2188851AlX.LIZ;
            C2192371ArD c2192371ArD = c2192431ArJ4.LIZLLL;
            if (c2192371ArD != null && (interfaceC625970Ogt = c2192431ArJ4.LIZJ) != null) {
                final HashMap<String, String> map = c2192371ArD.LIZ;
                c2192471ArN.LIZ = new InterfaceC2192341ArA(interfaceC625970Ogt, map) { // from class: X.1Ar7
                    public final InterfaceC625970Ogt LIZ;
                    public final HashMap<String, String> LIZIZ;

                    @Override // X.InterfaceC2192341ArA
                    public final AbstractC2192251Ar1 LIZ(InterfaceC625970Ogt interfaceC625970Ogt3) {
                        return new C2192231Aqz(this.LIZ, interfaceC625970Ogt3, this.LIZIZ);
                    }

                    {
                        this.LIZ = interfaceC625970Ogt;
                        this.LIZIZ = map;
                    }
                }.LIZ(c2192471ArN.LIZ);
            }
            C2192471ArN c2192471ArN2 = c2192441ArK.LIZJ;
            if (c2192471ArN2 == null) {
                c2192471ArN2 = null;
            }
            final int i = c2192441ArK.LIZIZ;
            c2192471ArN2.LIZ = new InterfaceC2192341ArA(str, c589160N8w2, str4, i, c2192431ArJ3) { // from class: X.1Ar9
                public final String LIZ;
                public final C589160N8w LIZIZ;
                public final String LIZJ;
                public final int LIZLLL;
                public final C2192431ArJ LJ;

                @Override // X.InterfaceC2192341ArA
                public final AbstractC2192251Ar1 LIZ(InterfaceC625970Ogt interfaceC625970Ogt3) {
                    return new AbstractC2192251Ar1(interfaceC625970Ogt3, this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ) { // from class: X.1Ar2
                        public String LIZIZ;
                        public final C589160N8w LIZJ;
                        public final String LIZLLL;
                        public final int LJ;
                        public final C2192431ArJ LJFF;
                        public volatile int LJI;

                        public final void LJIIJ() {
                            IUpdateKVRegisterKey iUpdateKVRegisterKey;
                            AnonymousClass1503 anonymousClass1503 = this.LJFF.LJ;
                            String str5 = this.LIZIZ;
                            InterfaceC625970Ogt interfaceC625970OgtLIZ = anonymousClass1503.LIZ(this.LJ, this.LIZJ, str5, this.LIZLLL);
                            if (!(this.LIZ instanceof C2192231Aqz)) {
                                this.LIZ = interfaceC625970OgtLIZ;
                                return;
                            }
                            Object objLIZ = C04TD.LIZ(IUpdateKVRegisterKey.class, false);
                            if (objLIZ != null) {
                                iUpdateKVRegisterKey = (IUpdateKVRegisterKey) objLIZ;
                            } else {
                                if (C04TD.LIZLLL == null) {
                                    synchronized (IUpdateKVRegisterKey.class) {
                                        if (C04TD.LIZLLL == null) {
                                            C04TD.LIZLLL = new UpdateRegisterKeyImpl();
                                        }
                                    }
                                }
                                iUpdateKVRegisterKey = C04TD.LIZLLL;
                            }
                            HashMap<String, String> mapLIZ2 = iUpdateKVRegisterKey.LIZ(this.LIZLLL, this.LIZ.LJ().name());
                            C2192231Aqz c2192231Aqz = (C2192231Aqz) this.LIZ;
                            c2192231Aqz.LIZJ = mapLIZ2;
                            c2192231Aqz.LIZ = interfaceC625970OgtLIZ;
                        }

                        public final void LJIIJJI() {
                            String currentUid;
                            IUserAccount iUserAccount = C2192411ArH.LIZ;
                            if (iUserAccount == null || (currentUid = iUserAccount.getCurrentUid()) == null) {
                                currentUid = CardStruct.IStatusCode.DEFAULT;
                            }
                            int iHashCode = currentUid.hashCode();
                            if (this.LJI != iHashCode) {
                                synchronized (this.LIZIZ) {
                                    try {
                                        if (this.LJI != iHashCode) {
                                            this.LIZIZ = currentUid;
                                            LJIIJ();
                                            this.LJI = iHashCode;
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                            }
                        }

                        @Override // X.AbstractC2192251Ar1, X.InterfaceC20344814j8
                        public final EnumC20429814wq LJ() {
                            LJIIJJI();
                            return super.LJ();
                        }

                        @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
                        public final Map<String, ?> getAll() {
                            LJIIJJI();
                            return super.getAll();
                        }

                        @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
                        public final void LIZ(String str5) {
                            LJIIJJI();
                            super.LIZ(str5);
                        }

                        @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
                        public final boolean contains(String str5) {
                            LJIIJJI();
                            return super.contains(str5);
                        }

                        @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
                        public final void LIZIZ(String str5, String str6) {
                            LJIIJJI();
                            super.LIZIZ(str5, str6);
                        }

                        @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
                        public final void LIZJ(String str5, int i2) {
                            LJIIJJI();
                            super.LIZJ(str5, i2);
                        }

                        @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
                        public final void LIZLLL(String str5, boolean z) {
                            LJIIJJI();
                            super.LIZLLL(str5, z);
                        }

                        @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
                        public final void LJFF(String str5, double d) {
                            LJIIJJI();
                            super.LJFF(str5, d);
                        }

                        @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
                        public final String[] LJI(String str5, String[] strArr) {
                            LJIIJJI();
                            return super.LJI(str5, strArr);
                        }

                        @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
                        public final void LJII(String str5, String[] strArr) {
                            LJIIJJI();
                            super.LJII(str5, strArr);
                        }

                        @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
                        public final void LJIIIIZZ(String str5, long j) {
                            LJIIJJI();
                            super.LJIIIIZZ(str5, j);
                        }

                        @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
                        public final void LJIIIZ(String str5, Set<String> set) {
                            LJIIJJI();
                            super.LJIIIZ(str5, set);
                        }

                        @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
                        public final boolean getBoolean(String str5, boolean z) {
                            LJIIJJI();
                            return super.getBoolean(str5, z);
                        }

                        @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
                        public final double getDouble(String str5, double d) {
                            LJIIJJI();
                            return super.getDouble(str5, d);
                        }

                        @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
                        public final int getInt(String str5, int i2) {
                            LJIIJJI();
                            return super.getInt(str5, i2);
                        }

                        @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
                        public final long getLong(String str5, long j) {
                            LJIIJJI();
                            return super.getLong(str5, j);
                        }

                        @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
                        public final String getString(String str5, String str6) {
                            LJIIJJI();
                            return super.getString(str5, str6);
                        }

                        @Override // X.AbstractC2192251Ar1, X.InterfaceC625970Ogt
                        public final Set<String> getStringSet(String str5, Set<String> set) {
                            LJIIJJI();
                            return super.getStringSet(str5, set);
                        }

                        {
                            this.LIZIZ = str;
                            this.LIZJ = c589160N8w;
                            this.LIZLLL = str;
                            this.LJ = i;
                            this.LJFF = c2192431ArJ;
                            this.LJI = str.hashCode();
                            if (C2192411ArH.LIZ == null) {
                                C2192411ArH.LIZ = UserAccountImpl.LIZIZ();
                            }
                        }
                    };
                }

                {
                    this.LIZ = str;
                    this.LIZIZ = c589160N8w2;
                    this.LIZJ = str4;
                    this.LIZLLL = i;
                    this.LJ = c2192431ArJ3;
                }
            }.LIZ(c2192471ArN2.LIZ);
        }
        List<? extends InterfaceC2192341ArA> list = c2192431ArJ3.LIZIZ;
        if (list != null) {
            for (InterfaceC2192341ArA interfaceC2192341ArA : list) {
                C2192471ArN c2192471ArN3 = c2192441ArK.LIZJ;
                if (c2192471ArN3 == null) {
                    c2192471ArN3 = null;
                }
                c2192471ArN3.LIZ = interfaceC2192341ArA.LIZ(c2192471ArN3.LIZ);
            }
        }
        c2192441ArK.LIZ.getClass();
        C2192471ArN c2192471ArN4 = c2192441ArK.LIZJ;
        InterfaceC625970Ogt interfaceC625970Ogt3 = (c2192471ArN4 != null ? c2192471ArN4 : null).LIZ;
        C2192401ArG.LIZ.getClass();
        C2192401ArG.LIZIZ.put(strLIZIZ, interfaceC625970Ogt3);
        return interfaceC625970Ogt3;
    }

    public C2192381ArE(String str, C589160N8w c589160N8w, String str2) {
        this.LIZ = str;
        this.LIZIZ = c589160N8w;
        this.LIZJ = str2;
    }
}
