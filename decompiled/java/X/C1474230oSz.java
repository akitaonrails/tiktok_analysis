package X;

import Y.ARunnableS123S0100000_23;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.ttm.player.s;
import com.ss.ttvideoengine.TTVideoEngine;
import cxo.s0;
import fyo.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0oSz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1474230oSz extends C1469200oKs implements InterfaceC2178671AOj, InterfaceC1467760oIY, InterfaceC1467780oIa, InterfaceC1469380oLA {
    public Surface LL;
    public SurfaceHolder LLILLJJLI;
    public TTVideoEngine LLILLL;
    public C1474420oTI LLILZ;
    public int LLILZIL;
    public AbstractC1468760oKA LLILZLL;
    public int LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public InterfaceC1487050onf LLJILJIL;
    public InterfaceC1474330oT9 LLJILJILJ;
    public boolean LLJILLL;
    public C2178751AOr LLJJ;
    public InterfaceC1395140mPQ LLJJI;
    public EnumC2281151EQn LLJJIII;
    public EnumC2281151EQn LLJJIJI;
    public final InterfaceC1474410oTH LLJJIJIIJIL;
    public SparseArray<C1474520oTS> LLJJJ;
    public List<C1474520oTS> LLJJJIL;
    public boolean LLJJJJ;
    public boolean LLJJJJJIL;
    public e LLJJJJLIIL;
    public boolean LLJJL;
    public int LLJJLIIIJLLLLLLLZ;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public int LLJLLIL;
    public boolean LLJLLL;
    public s LLL;
    public C1470240oMY LLLF;
    public boolean LLLFFI;
    public EnumC2281151EQn LLLFZ;
    public C1474280oT4 LLLI;
    public final WeakHandler.IHandler LLLIIL;
    public final WeakHandler LLLIILIL;
    public final C1474260oT2 LLLIL;
    public boolean LLJJIJIL = true;
    public boolean LLJL = true;
    public boolean LLJLIL = true;
    public String LLJZ = "";
    public final C1474340oTA LLJZIJLIL = new C1474340oTA();
    public final Map<String, C1467470oI5> LLLFF = new HashMap();
    public final C1474290oT5 LLLII = new InterfaceC1467890oIl(this) { // from class: X.0oT5
        public final WeakReference<C1474230oSz> LIZ;

        {
            this.LIZ = new WeakReference<>(this);
        }

        @Override // X.InterfaceC1467890oIl
        public final void LJLI(int i, int i2, String str) {
            C1474230oSz c1474230oSz;
            InterfaceC1487050onf interfaceC1487050onf;
            WeakReference<C1474230oSz> weakReference = this.LIZ;
            if (weakReference != null && (c1474230oSz = weakReference.get()) != null && (interfaceC1487050onf = c1474230oSz.LLJILJIL) != null) {
                interfaceC1487050onf.LJIIL(c1474230oSz.LLJJ, c1474230oSz.LLILZ, i2, str);
            }
        }
    };
    public final C1474310oT7 LLLIIII = new C1474310oT7(this);
    public long LLLIIIIL = -1;
    public boolean LLLIIIL = false;

    @Override // X.InterfaceC2178671AOj
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJLIIIJJI() {
    }

    @Override // X.InterfaceC2178671AOj
    public final C1474520oTS LIZ() {
        EnumC2281151EQn enumC2281151EQnLJJJJIZL;
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null && !TextUtils.isEmpty(tTVideoEngine.LJJJJI()) && this.LLJJJIL != null) {
            String strLJJJJI = this.LLILLL.LJJJJI();
            for (C1474520oTS c1474520oTS : this.LLJJJIL) {
                if (strLJJJJI.equals(c1474520oTS.LIZ(32))) {
                    return c1474520oTS;
                }
            }
        }
        EnumC2281151EQn enumC2281151EQn = this.LLJJIII;
        if (enumC2281151EQn == EnumC2281151EQn.Auto) {
            TTVideoEngine tTVideoEngine2 = this.LLILLL;
            if (tTVideoEngine2 != null && (enumC2281151EQnLJJJJIZL = tTVideoEngine2.LJJJJIZL()) != null && this.LLLFZ != enumC2281151EQnLJJJJIZL) {
                this.LLLFZ = enumC2281151EQnLJJJJIZL;
            }
            enumC2281151EQn = this.LLLFZ;
        }
        if (this.LLJJJ == null || enumC2281151EQn == null) {
            return null;
        }
        for (int i = 0; i < this.LLJJJ.size(); i++) {
            C1474520oTS c1474520oTSValueAt = this.LLJJJ.valueAt(i);
            if (c1474520oTSValueAt != null && c1474520oTSValueAt.getResolution() == enumC2281151EQn && c1474520oTSValueAt.LJFF() == 0) {
                return c1474520oTSValueAt;
            }
        }
        for (int i2 = 0; i2 < this.LLJJJ.size(); i2++) {
            C1474520oTS c1474520oTSValueAt2 = this.LLJJJ.valueAt(i2);
            if (c1474520oTSValueAt2 != null && c1474520oTSValueAt2.getResolution() == enumC2281151EQn) {
                return c1474520oTSValueAt2;
            }
        }
        return null;
    }

    @Override // X.InterfaceC2178671AOj
    public final boolean LJJIIJZLJL() {
        return this.LLILLL != null && this.LLJILLL;
    }

    @Override // X.InterfaceC2178671AOj
    public final boolean LJJIJIIJI() {
        TTVideoEngine tTVideoEngine = this.LLILLL;
        return tTVideoEngine != null && tTVideoEngine.LJLI();
    }

    @Override // X.InterfaceC2178671AOj
    public final int LJJIJIL() {
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJLL();
        }
        return 0;
    }

    @Override // X.InterfaceC2178671AOj
    public final boolean LJJJ() {
        return this.LLILLL == null;
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJJJIZL() {
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLJ(null);
        }
    }

    public final void LJJLIIIJLJLI() {
        this.LLJJ = new C2178751AOr(this, this.LLJJIJIIJIL);
        this.LLJJI = new InterfaceC1395140mPQ() { // from class: X.0oTD
            @Override // X.InterfaceC1395140mPQ
            public final TTVideoEngine LIZJ(Context context) {
                return new TTVideoEngine(context, 0);
            }
        };
        this.LLJILJILJ = new InterfaceC1474330oT9() { // from class: X.0oT6
            @Override // X.InterfaceC1474330oT9
            public final boolean LJIIIZ(EnumC804620VhM enumC804620VhM) {
                return false;
            }

            @Override // X.InterfaceC1474330oT9
            public final boolean LJJJJJ(C1473400oRe c1473400oRe) {
                return false;
            }

            @Override // X.InterfaceC1474330oT9
            public final C1474520oTS LJJJJJL(C1470240oMY c1470240oMY) {
                return null;
            }

            @Override // X.InterfaceC1474330oT9
            public final C1474520oTS LJJJ(C1473400oRe c1473400oRe) {
                return C1473460oRk.LIZIZ(c1473400oRe).get(EnumC2281151EQn.Standard.getIndex());
            }
        };
        this.LLLI = new C1474280oT4();
    }

    public final void LJJLIIIJLLLLLLLZ() {
        WeakHandler weakHandler = this.LLLIILIL;
        if (weakHandler != null) {
            weakHandler.removeMessages(EnumC1474440oTK.UPDATE_PROGRESS.getWhat());
        }
    }

    public final void LJJLIIJ() {
        String str;
        InterfaceC1474330oT9 interfaceC1474330oT9;
        EnumC1471780oP2 enumC1471780oP2 = EnumC1471780oP2.INS;
        enumC1471780oP2.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_SET_PARAMS_AND_PLAY, null, null, this.LLJJ);
        EnumC1471750oOz enumC1471750oOz = EnumC1471750oOz.INS;
        C1474420oTI c1474420oTI = this.LLILZ;
        EnumC1474430oTJ enumC1474430oTJ = EnumC1474430oTJ.PLAY;
        enumC1471750oOz.addTrace(c1474420oTI, C1471760oP0.LIZIZ("VCSetEngineParams", enumC1474430oTJ, 0));
        if (this.LLLIIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("videoEngine setPlayAPIVersion. videoEngine:");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(", vid:");
            sbLIZ.append(this.LLILZ.LIZ);
            sbLIZ.append(", hashCode:");
            sbLIZ.append(hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("videoEngine setPlayAPIVersion. videoEngine:");
            sbLIZ2.append(this.LLILLL);
            sbLIZ2.append(", vid:");
            sbLIZ2.append(this.LLILZ.LIZ);
            sbLIZ2.append(", hashCode:");
            sbLIZ2.append(hashCode());
            sbLIZ2.append(", thread:");
            sbLIZ2.append(C786410Ut5.u3());
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        this.LLILZ.getClass();
        this.LLILZ.getClass();
        if (TextUtils.isEmpty(null)) {
            this.LLILLL.LJJI(0, "");
        } else {
            TTVideoEngine tTVideoEngine = this.LLILLL;
            this.LLILZ.getClass();
            tTVideoEngine.LJJI(1, null);
        }
        if (TextUtils.isEmpty(this.LLILZ.LJII)) {
            this.LLILLL.LLJIJIL("");
        } else {
            this.LLILLL.LLJIJIL(this.LLILZ.LJII);
        }
        this.LLILZ.getClass();
        if (TextUtils.isEmpty(null)) {
            this.LLILLL.LLILZIL("");
        } else {
            TTVideoEngine tTVideoEngine2 = this.LLILLL;
            this.LLILZ.getClass();
            tTVideoEngine2.LLILZIL(null);
        }
        this.LLILZ.getClass();
        this.LLILLL.LIZ.LLLLLZ = this.LLJZIJLIL;
        this.LLILZ.getClass();
        if (TextUtils.isEmpty(null)) {
            this.LLILLL.LJZL("");
        } else {
            TTVideoEngine tTVideoEngine3 = this.LLILLL;
            this.LLILZ.getClass();
            tTVideoEngine3.LJZL(null);
        }
        this.LLILZ.getClass();
        if (TextUtils.isEmpty(null)) {
            this.LLILLL.LIZ.o = "";
        } else {
            TTVideoEngine tTVideoEngine4 = this.LLILLL;
            this.LLILZ.getClass();
            tTVideoEngine4.LIZ.o = null;
        }
        s sVar = this.LLL;
        if (sVar != null) {
            this.LLILLL.LIZLLL(sVar);
        }
        InterfaceC1487050onf interfaceC1487050onf = this.LLJILJIL;
        if (interfaceC1487050onf != null) {
            if (this.LLJJJJJIL) {
                interfaceC1487050onf.LJJIII(this.LLJJ, this.LLILZ);
            } else if (LJJIIJZLJL()) {
                this.LLJILJIL.LJIJJ(this.LLJJ, this.LLILZ);
            }
        }
        int i = this.LLILZIL;
        if (i == 0) {
            this.LLILLL.setSurface(this.LL);
        } else if (i == 2) {
            this.LLILLL.LLJ(this.LL);
        } else {
            this.LLILLL.LLIZ(this.LLILLJJLI);
        }
        this.LLLIIIIL = -1L;
        this.LLJJJJJIL = false;
        if (this.LLILLL != null) {
            try {
                if (this.LLJJJJ && ((this.LLJJJ != null || this.LLJJJIL != null) && (interfaceC1474330oT9 = this.LLJILJILJ) != null && interfaceC1474330oT9.LJIIIZ(C786410Ut5.e3(C807730VmN.LIZ)))) {
                    enumC1471780oP2.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_INTERCEPT_DO_PLAY, null, null, this.LLJJ);
                    return;
                }
                if (LJJIIJZLJL()) {
                    this.LLJLLIL = 3;
                    str = "replay";
                } else if (isPaused()) {
                    this.LLJLLIL = 2;
                    str = "pause2play";
                } else if (this.LLJLL) {
                    this.LLJLLIL = 4;
                    str = "prepared2play";
                } else {
                    this.LLJLLIL = 1;
                    str = "release2play";
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("doPlay mute:");
                sbLIZ3.append(this.LLIZLLLIL);
                C2188811AlT.LIZIZ(sbLIZ3);
                this.LLILLL.LJ(this.LLIZLLLIL);
                LJJLI(this.LLIZ);
                this.LLILLL.setLooping(this.LLJ);
                this.LLJILLL = false;
                if (!this.LLLIIIL) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("play volume:");
                    sbLIZ4.append(this.LLILLL.LJJLJLI());
                    sbLIZ4.append(" max volume:");
                    sbLIZ4.append(this.LLILLL.LJJJZ());
                    C2188811AlT.LIZIZ(sbLIZ4);
                }
                C1471760oP0 c1471760oP0LIZIZ = C1471760oP0.LIZIZ("EnginePlay", enumC1474430oTJ, 6);
                if (c1471760oP0LIZIZ != null) {
                    c1471760oP0LIZIZ.LIZ("type", str);
                    enumC1471750oOz.addTrace(this.LLILZ, c1471760oP0LIZIZ);
                }
                this.LLILLL.play();
                InterfaceC1487050onf interfaceC1487050onf2 = this.LLJILJIL;
                if (interfaceC1487050onf2 != null) {
                    interfaceC1487050onf2.LJJIJIIJIL(this.LLJJ, this.LLILZ, this.LLJLLIL);
                }
                enumC1471780oP2.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_DO_ENGINE_PLAY, null, null, this.LLJJ);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                Logger.throwException(e);
            }
        }
    }

    @Override // X.InterfaceC2178671AOj
    public final int getCurrentPosition() {
        return LJJIJLIJ(this.LLJI);
    }

    @Override // X.InterfaceC2178671AOj
    public final int getDuration() {
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null) {
            return tTVideoEngine.LJJJJL();
        }
        return 0;
    }

    @Override // X.InterfaceC2178671AOj
    public final boolean isPaused() {
        TTVideoEngine tTVideoEngine = this.LLILLL;
        return tTVideoEngine != null && tTVideoEngine.LJJLIIIJILLIZJL() == 2;
    }

    @Override // X.InterfaceC2178671AOj
    public final boolean isPlaying() {
        TTVideoEngine tTVideoEngine = this.LLILLL;
        return tTVideoEngine != null && tTVideoEngine.LJJLIIIJILLIZJL() == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC2178671AOj
    public final void play() {
        boolean z;
        Long lValueOf;
        e eVar;
        int i;
        if (this.LLILZ == null) {
            return;
        }
        String str = null;
        if (this.LLLIIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("play videoEngine:");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append(", vid:");
            sbLIZ.append(this.LLILZ.LIZ);
            sbLIZ.append(", hashCode:");
            sbLIZ.append(hashCode());
            sbLIZ.append(", title:");
            this.LLILZ.getClass();
            sbLIZ.append((String) null);
            C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("play videoEngine:");
            sbLIZ2.append(this.LLILLL);
            sbLIZ2.append(", vid:");
            sbLIZ2.append(this.LLILZ.LIZ);
            sbLIZ2.append(", hashCode:");
            sbLIZ2.append(hashCode());
            sbLIZ2.append(", thread:");
            sbLIZ2.append(C786410Ut5.u3());
            sbLIZ2.append(" title:");
            this.LLILZ.getClass();
            sbLIZ2.append((String) null);
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        EnumC1471780oP2 enumC1471780oP2 = EnumC1471780oP2.INS;
        enumC1471780oP2.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_PLAY, null, null, this.LLJJ);
        boolean zLJJIIZI = false;
        this.LLJJLIIIJLLLLLLLZ = 0;
        if (this.LLJJJJJIL) {
            if (this.LLILLL != null && (eVar = this.LLJJJJLIIL) != null && (i = eVar.LIZIZ) != 10408 && i != 50401) {
                EnumC1471750oOz.INS.addTrace(this.LLILZ, C1471760oP0.LIZIZ("VCErrRelease", EnumC1474430oTJ.PLAY, 0));
                InterfaceC1395140mPQ interfaceC1395140mPQ = this.LLJJI;
                if (interfaceC1395140mPQ instanceof InterfaceC1474350oTB) {
                    ((InterfaceC1474350oTB) interfaceC1395140mPQ).LIZIZ();
                }
                if (this.LLJIJIL) {
                    this.LLILLL.LJIILL();
                } else {
                    this.LLILLL.release();
                }
                LJJLIIIJL(this.LLILLL);
                this.LLILLL = null;
                enumC1471780oP2.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_RELEASE_ENGINE_WHEN_ERR, null, this.LLJJJJLIIL, this.LLJJ);
            }
            this.LLJJJJLIIL = null;
        }
        if (this.LLILLL == null) {
            this.LLJILLL = false;
            this.LLJJJJJIL = false;
            this.LLLFFI = false;
            this.LLLFZ = null;
            this.LLJJIII = null;
            ((HashMap) this.LLLFF).clear();
            this.LLJLL = false;
            boolean z2 = this.LLJJI instanceof InterfaceC1474350oTB;
            TTVideoEngine tTVideoEngine = this.LLILLL;
            if (tTVideoEngine != null) {
                int i2 = this.LLILZIL;
                if (i2 == 0 || i2 == 2) {
                    tTVideoEngine.setSurface(null);
                } else {
                    tTVideoEngine.LLIZ(null);
                }
                if (z2) {
                    ((InterfaceC1474350oTB) this.LLJJI).LIZIZ();
                }
                if (this.LLJIJIL) {
                    this.LLILLL.LJIILL();
                } else {
                    this.LLILLL.release();
                }
                LJJLIIIJL(this.LLILLL);
            }
            EnumC1471750oOz.INS.addTrace(this.LLILZ, C1471760oP0.LIZIZ("CreateEngine", EnumC1474430oTJ.PLAY, 0));
            if (z2) {
                InterfaceC1474350oTB interfaceC1474350oTB = (InterfaceC1474350oTB) this.LLJJI;
                if (interfaceC1474350oTB.LIZIZ() != -1) {
                    interfaceC1474350oTB.LIZLLL();
                    interfaceC1474350oTB.LJ();
                    interfaceC1474350oTB.LIZIZ();
                }
                new TTVideoEngine(C807730VmN.LIZ, interfaceC1474350oTB.LIZLLL(), interfaceC1474350oTB.LJ());
                this.LLILLL = ((InterfaceC1474350oTB) this.LLJJI).LIZ();
            } else {
                this.LLILLL = this.LLJJI.LIZJ(C807730VmN.LIZ);
            }
            TTVideoEngine tTVideoEngine2 = this.LLILLL;
            if (tTVideoEngine2 == null) {
                throw new NullPointerException("video engine can't be null");
            }
            AbstractC1468760oKA abstractC1468760oKA = this.LLILZLL;
            if (abstractC1468760oKA != null) {
                tTVideoEngine2.LIZ.LLLLLLZZ = abstractC1468760oKA;
            }
            tTVideoEngine2.LLJJI(this);
            this.LLILLL.LLIIIJ(this.LLLII);
            this.LLILLL.LLILLL(this.LLLIIII);
            this.LLILLL.LLJJIII(this);
            this.LLILLL.LLILLIZIL(this);
            this.LLILLL.LLJJ(this);
            enumC1471780oP2 = enumC1471780oP2;
            str = null;
            enumC1471780oP2.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_CREATE_ENGINE, null, null, this.LLJJ);
            z = true;
        } else {
            z = false;
        }
        EnumC1474430oTJ enumC1474430oTJ = EnumC1474430oTJ.PLAY;
        C1471760oP0 c1471760oP0LIZIZ = C1471760oP0.LIZIZ("VCPlay", enumC1474430oTJ, 6);
        if (c1471760oP0LIZIZ != null) {
            EnumC1471750oOz.INS.addTrace(this.LLILZ, c1471760oP0LIZIZ);
        }
        if (z) {
            if (c1471760oP0LIZIZ != null) {
                c1471760oP0LIZIZ.LIZ("type", "init");
            }
            C1471760oP0 c1471760oP0LIZIZ2 = C1471760oP0.LIZIZ("VCSetEngineSource", enumC1474430oTJ, 6);
            EnumC1471750oOz.INS.addTrace(this.LLILZ, c1471760oP0LIZIZ2);
            C1474420oTI c1474420oTI = this.LLILZ;
            if (c1474420oTI.LJFF != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("try_play");
                sbLIZ3.append("_direct_url_use_data_loader");
                C2188811AlT.LIZIZ(sbLIZ3);
                if (c1471760oP0LIZIZ2 != null) {
                    c1471760oP0LIZIZ2.LIZ("source", "DirectUrlUseDataLoader");
                }
                EnumC2281151EQn enumC2281151EQn = this.LLJJIII;
                if (enumC2281151EQn != null) {
                    LJJLIL(enumC2281151EQn, false);
                } else {
                    this.LLILZ.getClass();
                    LJJLJ(str);
                }
                TTVideoEngine tTVideoEngine3 = this.LLILLL;
                C1474420oTI c1474420oTI2 = this.LLILZ;
                tTVideoEngine3.LJZ(c1474420oTI2.LJFF, c1474420oTI2.LJI);
            } else if (c1474420oTI.LIZLLL != null) {
                if (c1471760oP0LIZIZ2 != null) {
                    c1471760oP0LIZIZ2.LIZ("source", "VideoModel");
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("try_play");
                sbLIZ4.append("_cache_video_model vid:");
                sbLIZ4.append(this.LLILZ.LIZ);
                sbLIZ4.append(" title:");
                this.LLILZ.getClass();
                sbLIZ4.append(str);
                C2188811AlT.LIZIZ(sbLIZ4);
                this.LLILLL.LLJJIJI(this.LLILZ.LIZLLL);
                zLJJIIZI = LJJIIZI(this.LLILZ.LIZLLL);
            } else if (!TextUtils.isEmpty(str)) {
                if (c1471760oP0LIZIZ2 != null) {
                    c1471760oP0LIZIZ2.LIZ("source", "LocalUrl");
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("try_play");
                sbLIZ5.append("_local_url:");
                this.LLILZ.getClass();
                sbLIZ5.append(str);
                C2188811AlT.LIZIZ(sbLIZ5);
                EnumC2281151EQn enumC2281151EQn2 = this.LLJJIII;
                if (enumC2281151EQn2 != null) {
                    LJJLIL(enumC2281151EQn2, false);
                } else {
                    this.LLILZ.getClass();
                    LJJLJ(str);
                }
                TTVideoEngine tTVideoEngine4 = this.LLILLL;
                this.LLILZ.getClass();
                tTVideoEngine4.LJIJ(str);
            } else if (TextUtils.isEmpty(this.LLILZ.LJ)) {
                this.LLILZ.getClass();
                this.LLILZ.getClass();
                if (TextUtils.isEmpty(str)) {
                    this.LLILZ.getClass();
                    if (TextUtils.isEmpty(str)) {
                        if (c1471760oP0LIZIZ2 != null) {
                            c1471760oP0LIZIZ2.LIZ("source", "vid");
                        }
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("try_play");
                        sbLIZ6.append("_vid:");
                        sbLIZ6.append(this.LLILZ.LIZ);
                        sbLIZ6.append(" title:");
                        this.LLILZ.getClass();
                        sbLIZ6.append(str);
                        C2188811AlT.LIZIZ(sbLIZ6);
                        this.LLILLL.LJJIIZ(this.LLILZ.LIZ);
                        EnumC2281151EQn enumC2281151EQn3 = this.LLJJIII;
                        if (enumC2281151EQn3 != null) {
                            LJJLIL(enumC2281151EQn3, false);
                        } else {
                            this.LLILZ.getClass();
                            LJJLJ(str);
                        }
                    } else {
                        if (c1471760oP0LIZIZ2 != null) {
                            c1471760oP0LIZIZ2.LIZ("source", "MusicPath");
                        }
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append("try_play");
                        sbLIZ7.append("_music_path:");
                        this.LLILZ.getClass();
                        sbLIZ7.append(str);
                        C2188811AlT.LIZIZ(sbLIZ7);
                        EnumC2281151EQn enumC2281151EQn4 = this.LLJJIII;
                        if (enumC2281151EQn4 != null) {
                            LJJLIL(enumC2281151EQn4, false);
                        } else {
                            this.LLILZ.getClass();
                            LJJLJ(str);
                        }
                        TTVideoEngine tTVideoEngine5 = this.LLILLL;
                        this.LLILZ.getClass();
                        tTVideoEngine5.LJIJ(str);
                    }
                } else {
                    if (c1471760oP0LIZIZ2 != null) {
                        c1471760oP0LIZIZ2.LIZ("source", "MusicUrl");
                    }
                    StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                    sbLIZ8.append("try_play");
                    sbLIZ8.append("_music_url:");
                    this.LLILZ.getClass();
                    sbLIZ8.append(str);
                    C2188811AlT.LIZIZ(sbLIZ8);
                    EnumC2281151EQn enumC2281151EQn5 = this.LLJJIII;
                    if (enumC2281151EQn5 != null) {
                        LJJLIL(enumC2281151EQn5, false);
                    } else {
                        this.LLILZ.getClass();
                        LJJLJ(str);
                    }
                    TTVideoEngine tTVideoEngine6 = this.LLILLL;
                    this.LLILZ.getClass();
                    tTVideoEngine6.LJIJI(str);
                }
            } else {
                if (c1471760oP0LIZIZ2 != null) {
                    c1471760oP0LIZIZ2.LIZ("source", "VideoUrl");
                }
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("try_play");
                sbLIZ9.append("_direct_url:");
                sbLIZ9.append(this.LLILZ.LJ);
                C2188811AlT.LIZIZ(sbLIZ9);
                EnumC2281151EQn enumC2281151EQn6 = this.LLJJIII;
                if (enumC2281151EQn6 != null) {
                    LJJLIL(enumC2281151EQn6, false);
                } else {
                    this.LLILZ.getClass();
                    LJJLJ(str);
                }
                this.LLILLL.LJIJI(this.LLILZ.LJ);
                this.LLILZ.getClass();
            }
            long j = this.LLLIIIIL;
            long jLongValue = 0;
            if (j > 0) {
                LJJLJLI(j);
            } else {
                if (this.LLJJIJIL) {
                    String str2 = this.LLILZ.LIZ;
                    if (str2 != null) {
                        LinkedHashMap<String, Pair<Long, Long>> linkedHashMap = C08GJ.LIZ;
                        synchronized (linkedHashMap) {
                            try {
                                Pair<Long, Long> pair = linkedHashMap.get(str2);
                                lValueOf = str;
                                if (pair != null) {
                                    Object obj = pair.first;
                                    lValueOf = str;
                                    if (obj != null) {
                                        lValueOf = Long.valueOf(((Long) obj).longValue());
                                    }
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        if (lValueOf != 0) {
                            jLongValue = lValueOf.longValue();
                        }
                    }
                } else {
                    jLongValue = this.LLILZ.LIZJ;
                }
                LJJLJLI(jLongValue);
            }
            InterfaceC1487050onf interfaceC1487050onf = this.LLJILJIL;
            if (interfaceC1487050onf != null) {
                interfaceC1487050onf.LJJIJ(this.LLJJ, this.LLILZ);
            }
            if (zLJJIIZI) {
                enumC1471780oP2.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_INTERCEPT_INIT_PLAY, null, null, this.LLJJ);
            } else {
                LJJLIIJ();
            }
        } else {
            if (c1471760oP0LIZIZ != null) {
                c1471760oP0LIZIZ.LIZ("type", "paused");
            }
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append("pause play:");
            sbLIZ10.append(this.LLILZ.LIZ);
            sbLIZ10.append(" title:");
            this.LLILZ.getClass();
            sbLIZ10.append(str);
            C2188811AlT.LIZIZ(sbLIZ10);
            LJJLIIJ();
        }
        this.LLJLILLLLZIIL = true;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0oT2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0oT5] */
    public C1474230oSz() {
        new ARunnableS123S0100000_23(this, 219);
        this.LLLIIL = new WeakHandler.IHandler() { // from class: X.0oT1
            @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
            public final void handleMsg(Message message) {
                int i;
                C1474420oTI c1474420oTI;
                C1474230oSz c1474230oSz;
                InterfaceC1487050onf interfaceC1487050onf;
                C1AMG c1amg;
                boolean z = true;
                if (C1474320oT8.LIZ[EnumC1474440oTK.getMsg(message.what).ordinal()] == 1) {
                    C1474230oSz c1474230oSz2 = this.LL;
                    C1474420oTI c1474420oTI2 = c1474230oSz2.LLILZ;
                    if (c1474420oTI2 == null || (c1amg = c1474420oTI2.LJIIIIZZ) == null || (i = c1amg.LIZJ) <= 0) {
                        i = 500;
                    }
                    if (c1474230oSz2.LLILLL != null) {
                        if (HandlerHook.getMessageObj(message.obj) == null || !((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue()) {
                            z = false;
                        }
                        int currentPosition = this.LL.getCurrentPosition();
                        int iLJJJJL = this.LL.LLILLL.LJJJJL();
                        if (currentPosition >= iLJJJJL) {
                            currentPosition = iLJJJJL;
                        }
                        if (iLJJJJL > 0 && ((!z || currentPosition < i) && (interfaceC1487050onf = (c1474230oSz = this.LL).LLJILJIL) != null)) {
                            interfaceC1487050onf.LJIILIIL(c1474230oSz.LLJJ, c1474230oSz.LLILZ, currentPosition, iLJJJJL);
                        }
                        C1474230oSz c1474230oSz3 = this.LL;
                        if (!c1474230oSz3.LLJILLL && currentPosition > 0 && (c1474420oTI = c1474230oSz3.LLILZ) != null && !TextUtils.isEmpty(c1474420oTI.LIZ)) {
                            C08GJ.LIZ(currentPosition, this.LL.LLILZ.LIZ);
                        }
                    }
                    if (!this.LL.LJJIIJZLJL() && this.LL.isPlaying()) {
                        this.LL.LLLIILIL.sendMessageDelayed(this.LL.LLLIILIL.obtainMessage(EnumC1474440oTK.UPDATE_PROGRESS.getWhat()), i);
                    }
                }
            }
        };
        this.LLLIILIL = new WeakHandler(this.LLLIIL);
        this.LLLIL = new s0() { // from class: X.0oT2
            @Override // cxo.s0
            public final void LJII(boolean z) {
                String str;
                WeakHandler weakHandler;
                C1474230oSz c1474230oSz = this.LL;
                c1474230oSz.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("seek_complete:");
                if (z) {
                    str = "done";
                } else {
                    str = "fail";
                }
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                EnumC1471780oP2.INS.trace(c1474230oSz.LLILZ, EnumC1474270oT3.CONTROLLER_SEEK_COMPLETE, null, null, c1474230oSz.LLJJ);
                EnumC1471750oOz.INS.addTrace(c1474230oSz.LLILZ, C1471760oP0.LIZIZ("VCOnSeekComplete", EnumC1474430oTJ.SEEK, 6));
                if (!c1474230oSz.LJJIIJZLJL() && c1474230oSz.isPlaying() && ((!c1474230oSz.LLJJL || c1474230oSz.LLJ) && (weakHandler = c1474230oSz.LLLIILIL) != null)) {
                    weakHandler.sendEmptyMessage(EnumC1474440oTK.UPDATE_PROGRESS.getWhat());
                }
                InterfaceC1487050onf interfaceC1487050onf = c1474230oSz.LLJILJIL;
                if (interfaceC1487050onf != null) {
                    interfaceC1487050onf.LJJJIL(c1474230oSz.LLJJ, c1474230oSz.LLILZ, z);
                }
            }
        };
        LJJLIIIJLJLI();
    }

    @Override // X.InterfaceC2178671AOj
    public final void pause() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause_video vid:");
        C1474420oTI c1474420oTI = this.LLILZ;
        sbLIZ.append(c1474420oTI != null ? c1474420oTI.LIZ : "entity null");
        sbLIZ.append(" hashCode:");
        sbLIZ.append(hashCode());
        sbLIZ.append(" title:");
        sbLIZ.append(this.LLILZ != null ? null : "entity null");
        C2188811AlT.LIZIZ(sbLIZ);
        EnumC1471780oP2.INS.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_PAUSE, null, null, this.LLJJ);
        EnumC1471750oOz.INS.addTrace(this.LLILZ, C1471760oP0.LIZIZ("VCPause", EnumC1474430oTJ.PLAY, 6));
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.pause();
        }
        LJJLIIIJLLLLLLLZ();
        this.LLLI.LIZ();
    }

    @Override // X.InterfaceC2178671AOj
    public final void release() {
        C1474420oTI c1474420oTI;
        if (LJJJ()) {
            return;
        }
        this.LLLI.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releaseEngineEnabled:");
        sbLIZ.append(this.LLJLIL);
        sbLIZ.append(", asyncRelease:");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(", vid:");
        sbLIZ.append(this.LLILZ.LIZ);
        sbLIZ.append(" title:");
        this.LLILZ.getClass();
        Object obj = null;
        sbLIZ.append((String) null);
        C2188811AlT.LIZIZ(sbLIZ);
        EnumC1471780oP2.INS.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_RELEASE, null, null, this.LLJJ);
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LJJJJZI(83);
            this.LLILLL.LJJJJZI(84);
            this.LLILLL.LJJLL();
        }
        InterfaceC1487050onf interfaceC1487050onf = this.LLJILJIL;
        if (interfaceC1487050onf != null) {
            interfaceC1487050onf.LIZLLL(this.LLJJ, this.LLILZ);
        }
        LJJLIIIJLLLLLLLZ();
        if (!this.LLJILLL) {
            long currentPosition = getCurrentPosition();
            if (currentPosition > 0 && (c1474420oTI = this.LLILZ) != null && !TextUtils.isEmpty(c1474420oTI.LIZ)) {
                C08GJ.LIZ(currentPosition, this.LLILZ.LIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Release Vid:");
                sbLIZ2.append(this.LLILZ.LIZ);
                sbLIZ2.append(" Push Pos:");
                sbLIZ2.append(currentPosition);
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
        this.LLJLL = false;
        this.LLJILLL = false;
        this.LLJJIII = null;
        this.LLLIIIIL = -1L;
        this.LLJJJ = null;
        this.LLJJJIL = null;
        this.LLJJJJJIL = false;
        this.LLJJJJLIIL = null;
        this.LLLFZ = null;
        this.LLLFFI = false;
        this.LLLF = null;
        this.LLL = null;
        ((HashMap) this.LLLFF).clear();
        this.LLJLILLLLZIIL = false;
        this.LLJZ = "";
        TTVideoEngine tTVideoEngine2 = this.LLILLL;
        if (tTVideoEngine2 != null && this.LLJLIL) {
            int i = this.LLILZIL;
            if (i == 0 || i == 2) {
                tTVideoEngine2.setSurface(null);
            } else {
                tTVideoEngine2.LLIZ(null);
            }
            InterfaceC1395140mPQ interfaceC1395140mPQ = this.LLJJI;
            if (interfaceC1395140mPQ instanceof InterfaceC1474350oTB) {
                ((InterfaceC1474350oTB) interfaceC1395140mPQ).LIZIZ();
            }
            if (this.LLJIJIL) {
                tTVideoEngine2.LJIILL();
            } else {
                tTVideoEngine2.release();
            }
            LJJLIIIJL(tTVideoEngine2);
        }
        this.LLILLL = null;
        InterfaceC1487050onf interfaceC1487050onf2 = this.LLJILJIL;
        if (interfaceC1487050onf2 != null) {
            interfaceC1487050onf2.LJJIJLIJ(this.LLJJ, this.LLILZ);
        }
        C1471760oP0 c1471760oP0LIZIZ = C1471760oP0.LIZIZ("VCRelease", EnumC1474430oTJ.PLAY, 6);
        if (c1471760oP0LIZIZ != null) {
            if (this.LLILZ != null) {
                try {
                    Map map = (Map) (Map.class.isInstance(null) ? Map.class.cast(null) : null);
                    if (map != null) {
                        obj = map.get("release_reason");
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (obj instanceof String) {
                c1471760oP0LIZIZ.LIZ("reason", (String) obj);
            }
            EnumC1471750oOz.INS.addTrace(this.LLILZ, c1471760oP0LIZIZ);
        }
        EnumC1471750oOz.INS.getTracesJson(this.LLILZ);
    }

    @Override // X.InterfaceC2178671AOj
    public final s LJII() {
        return this.LLL;
    }

    @Override // X.InterfaceC2178671AOj
    public final boolean LJIIZILJ() {
        return this.LLJLL;
    }

    @Override // X.InterfaceC2178671AOj
    public final boolean LJJJI() {
        return this.LLLFFI;
    }

    @Override // X.InterfaceC2178671AOj
    public final boolean LJJJJLI() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.InterfaceC2178671AOj
    public final TTVideoEngine LJJJZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC2178671AOj
    public final C1474420oTI getPlayEntity() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC2178671AOj
    public final EnumC2281151EQn getResolution() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC2178671AOj
    public final InterfaceC1471800oP4 getVideoStateInquirer() {
        return this.LLJJ;
    }

    @Override // X.InterfaceC2178671AOj
    public final boolean isLoop() {
        return this.LLJ;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0oT2] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0oT5] */
    public C1474230oSz(InterfaceC1474410oTH interfaceC1474410oTH) {
        new ARunnableS123S0100000_23(this, 219);
        this.LLLIIL = new WeakHandler.IHandler() { // from class: X.0oT1
            @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
            public final void handleMsg(Message message) {
                int i;
                C1474420oTI c1474420oTI;
                C1474230oSz c1474230oSz;
                InterfaceC1487050onf interfaceC1487050onf;
                C1AMG c1amg;
                boolean z = true;
                if (C1474320oT8.LIZ[EnumC1474440oTK.getMsg(message.what).ordinal()] == 1) {
                    C1474230oSz c1474230oSz2 = this.LL;
                    C1474420oTI c1474420oTI2 = c1474230oSz2.LLILZ;
                    if (c1474420oTI2 == null || (c1amg = c1474420oTI2.LJIIIIZZ) == null || (i = c1amg.LIZJ) <= 0) {
                        i = 500;
                    }
                    if (c1474230oSz2.LLILLL != null) {
                        if (HandlerHook.getMessageObj(message.obj) == null || !((Boolean) HandlerHook.getMessageObj(message.obj)).booleanValue()) {
                            z = false;
                        }
                        int currentPosition = this.LL.getCurrentPosition();
                        int iLJJJJL = this.LL.LLILLL.LJJJJL();
                        if (currentPosition >= iLJJJJL) {
                            currentPosition = iLJJJJL;
                        }
                        if (iLJJJJL > 0 && ((!z || currentPosition < i) && (interfaceC1487050onf = (c1474230oSz = this.LL).LLJILJIL) != null)) {
                            interfaceC1487050onf.LJIILIIL(c1474230oSz.LLJJ, c1474230oSz.LLILZ, currentPosition, iLJJJJL);
                        }
                        C1474230oSz c1474230oSz3 = this.LL;
                        if (!c1474230oSz3.LLJILLL && currentPosition > 0 && (c1474420oTI = c1474230oSz3.LLILZ) != null && !TextUtils.isEmpty(c1474420oTI.LIZ)) {
                            C08GJ.LIZ(currentPosition, this.LL.LLILZ.LIZ);
                        }
                    }
                    if (!this.LL.LJJIIJZLJL() && this.LL.isPlaying()) {
                        this.LL.LLLIILIL.sendMessageDelayed(this.LL.LLLIILIL.obtainMessage(EnumC1474440oTK.UPDATE_PROGRESS.getWhat()), i);
                    }
                }
            }
        };
        this.LLLIILIL = new WeakHandler(this.LLLIIL);
        this.LLLIL = new s0() { // from class: X.0oT2
            @Override // cxo.s0
            public final void LJII(boolean z) {
                String str;
                WeakHandler weakHandler;
                C1474230oSz c1474230oSz = this.LL;
                c1474230oSz.getClass();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("seek_complete:");
                if (z) {
                    str = "done";
                } else {
                    str = "fail";
                }
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                EnumC1471780oP2.INS.trace(c1474230oSz.LLILZ, EnumC1474270oT3.CONTROLLER_SEEK_COMPLETE, null, null, c1474230oSz.LLJJ);
                EnumC1471750oOz.INS.addTrace(c1474230oSz.LLILZ, C1471760oP0.LIZIZ("VCOnSeekComplete", EnumC1474430oTJ.SEEK, 6));
                if (!c1474230oSz.LJJIIJZLJL() && c1474230oSz.isPlaying() && ((!c1474230oSz.LLJJL || c1474230oSz.LLJ) && (weakHandler = c1474230oSz.LLLIILIL) != null)) {
                    weakHandler.sendEmptyMessage(EnumC1474440oTK.UPDATE_PROGRESS.getWhat());
                }
                InterfaceC1487050onf interfaceC1487050onf = c1474230oSz.LLJILJIL;
                if (interfaceC1487050onf != null) {
                    interfaceC1487050onf.LJJJIL(c1474230oSz.LLJJ, c1474230oSz.LLILZ, z);
                }
            }
        };
        this.LLJJIJIIJIL = interfaceC1474410oTH;
        LJJLIIIJLJLI();
    }

    public static void LJJLIIIJL(TTVideoEngine tTVideoEngine) {
        if (tTVideoEngine != null) {
            tTVideoEngine.LLJJI(null);
            tTVideoEngine.LLJJIII(null);
            tTVideoEngine.LLILLIZIL(null);
            tTVideoEngine.LLJJ(null);
            tTVideoEngine.LJLJJLL();
            tTVideoEngine.LLIIIJ(null);
            tTVideoEngine.LLILLL(null);
        }
    }

    @Override // X.InterfaceC2178671AOj
    public final void LIZLLL(s sVar) {
        this.LLL = sVar;
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null && sVar != null) {
            tTVideoEngine.LIZLLL(sVar);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJ(TTVideoEngine tTVideoEngine) {
        float fLJJJZ;
        EnumC1471750oOz.INS.addTrace(this.LLILZ, C1471760oP0.LIZIZ("VCOnRenderStart", EnumC1474430oTJ.PLAY, 6));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRenderStart:");
        sbLIZ.append(this.LLILZ.LIZ);
        sbLIZ.append(" title:");
        this.LLILZ.getClass();
        sbLIZ.append((String) null);
        sbLIZ.append(" hashCode:");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        EnumC1471780oP2 enumC1471780oP2 = EnumC1471780oP2.INS;
        enumC1471780oP2.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_ON_RENDER_START, null, null, this.LLJJ);
        if (!this.LLLIIIL) {
            C1474420oTI c1474420oTI = this.LLILZ;
            TTVideoEngine tTVideoEngine2 = this.LLILLL;
            float fLJJLJLI = 0.0f;
            if (tTVideoEngine2 != null) {
                fLJJJZ = tTVideoEngine2.LJJJZ();
            } else {
                fLJJJZ = 0.0f;
            }
            TTVideoEngine tTVideoEngine3 = this.LLILLL;
            if (tTVideoEngine3 != null) {
                fLJJLJLI = tTVideoEngine3.LJJLJLI();
            }
            enumC1471780oP2.updateVolume(c1474420oTI, fLJJJZ, fLJJLJLI);
        }
        this.LLLFFI = true;
        InterfaceC1487050onf interfaceC1487050onf = this.LLJILJIL;
        if (interfaceC1487050onf != null) {
            interfaceC1487050onf.LJJIJIL(this.LLJJ, this.LLILZ);
            this.LLJILJIL.LJII(this.LLJJ, this.LLILZ);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJI(e eVar) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onError:");
        sbLIZ.append(eVar.LIZLLL);
        sbLIZ.append(" errorCode:");
        sbLIZ.append(eVar.LIZ);
        sbLIZ.append(" internalCode:");
        sbLIZ.append(eVar.LIZIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1471760oP0 c1471760oP0LIZIZ = C1471760oP0.LIZIZ("VCOnError", EnumC1474430oTJ.PLAY, 6);
        if (c1471760oP0LIZIZ != null) {
            c1471760oP0LIZIZ.LIZ("err", strLIZIZ);
            EnumC1471750oOz.INS.addTrace(this.LLILZ, c1471760oP0LIZIZ);
        }
        EnumC1471780oP2.INS.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_ON_ERROR, strLIZIZ, eVar, this.LLJJ);
        this.LLJJJJJIL = true;
        this.LLJLILLLLZIIL = false;
        this.LLJLL = false;
        this.LLJJJJLIIL = eVar;
        InterfaceC1487050onf interfaceC1487050onf = this.LLJILJIL;
        if (interfaceC1487050onf != null) {
            interfaceC1487050onf.LJJ(this.LLJJ, this.LLILZ, eVar);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIIIZ(TTVideoEngine tTVideoEngine) {
        EnumC1471750oOz.INS.addTrace(this.LLILZ, C1471760oP0.LIZIZ("VCOnPrepare", EnumC1474430oTJ.PLAY, 3));
        EnumC1471780oP2.INS.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_ON_PREPARE, null, null, this.LLJJ);
        InterfaceC1487050onf interfaceC1487050onf = this.LLJILJIL;
        if (interfaceC1487050onf != null) {
            interfaceC1487050onf.LJJJI(this.LLJJ, this.LLILZ);
        }
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJIIJ(long j) {
        String strLIZIZ;
        boolean z;
        InterfaceC1487050onf interfaceC1487050onf = this.LLJILJIL;
        if (interfaceC1487050onf != null) {
            interfaceC1487050onf.LJFF(this.LLJJ, this.LLILZ, j);
        }
        if (this.LLILLL != null) {
            if (j >= r0.LJJJJL()) {
                z = true;
            } else {
                z = false;
            }
            this.LLJJL = z;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("seek:");
        if (this.LLJJL) {
            strLIZIZ = "end";
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("");
            sbLIZ2.append(j);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        if (this.LLILLL == null) {
            return;
        }
        EnumC1471780oP2.INS.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_SEEK, null, null, this.LLJJ);
        EnumC1471750oOz.INS.addTrace(this.LLILZ, C1471760oP0.LIZIZ("VCSeekTo", EnumC1474430oTJ.SEEK, 6));
        this.LLJL = false;
        LJJLIIIJLLLLLLLZ();
        this.LLILLL.LJIJJLI((int) j, this.LLLIL);
        InterfaceC1487050onf interfaceC1487050onf2 = this.LLJILJIL;
        if (interfaceC1487050onf2 != null) {
            interfaceC1487050onf2.LJJIZ(this.LLJJ, this.LLILZ, j);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIILIIL(TTVideoEngine tTVideoEngine) {
        EnumC1471750oOz.INS.addTrace(this.LLILZ, C1471760oP0.LIZIZ("VCOnPrepared", EnumC1474430oTJ.PLAY, 6));
        this.LLJLL = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPrepared:");
        sbLIZ.append(this.LLILZ.LIZ);
        sbLIZ.append(" title:");
        this.LLILZ.getClass();
        sbLIZ.append((String) null);
        sbLIZ.append(" hashCode:");
        sbLIZ.append(hashCode());
        C2188811AlT.LIZIZ(sbLIZ);
        EnumC1471780oP2.INS.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_ON_PREPARED, null, null, this.LLJJ);
        InterfaceC1487050onf interfaceC1487050onf = this.LLJILJIL;
        if (interfaceC1487050onf != null) {
            interfaceC1487050onf.LJIIZILJ(this.LLJJ, this.LLILZ);
        }
        this.LLLI.LIZIZ();
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJIILJJIL(boolean z) {
        this.LLIZLLLIL = z;
        if (this.LLILLL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setMute:");
            sbLIZ.append(z);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LLILLL.LJ(z);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIILL(TTVideoEngine tTVideoEngine) {
        String str;
        this.LLJILLL = true;
        this.LLJJJJJIL = false;
        this.LLJJJJLIIL = null;
        if (!this.LLJ) {
            LJJLIIIJLLLLLLLZ();
        }
        this.LLILLL.LJJJJZI(83);
        this.LLILLL.LJJJJZI(84);
        tTVideoEngine.LJJLL();
        if (this.LLJ) {
            tTVideoEngine.LJJLL();
        }
        C1474420oTI c1474420oTI = this.LLILZ;
        if (c1474420oTI != null && !TextUtils.isEmpty(c1474420oTI.LIZ) && (str = this.LLILZ.LIZ) != null) {
            LinkedHashMap<String, Pair<Long, Long>> linkedHashMap = C08GJ.LIZ;
            synchronized (linkedHashMap) {
                try {
                    linkedHashMap.remove(str);
                } finally {
                }
            }
            LinkedHashMap<String, Boolean> linkedHashMap2 = C08GJ.LIZIZ;
            synchronized (linkedHashMap2) {
                try {
                    linkedHashMap2.remove(str);
                } finally {
                }
            }
        }
        this.LLLIIIIL = -1L;
        InterfaceC1487050onf interfaceC1487050onf = this.LLJILJIL;
        if (interfaceC1487050onf != null) {
            interfaceC1487050onf.LIZJ(this.LLJJ, this.LLILZ);
            this.LLJILJIL.LJJI(this.LLJJ, this.LLILZ);
            if (this.LLJ) {
                this.LLJILJIL.LJIJJ(this.LLJJ, this.LLILZ);
                this.LLJILLL = false;
            }
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIJJLI(int i) {
        C1471760oP0 c1471760oP0LIZIZ = C1471760oP0.LIZIZ("VCOnVideoStatusException", EnumC1474430oTJ.PLAY, 6);
        if (c1471760oP0LIZIZ != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(i);
            c1471760oP0LIZIZ.LIZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, C2188811AlT.LIZIZ(sbLIZ));
            EnumC1471750oOz.INS.addTrace(this.LLILZ, c1471760oP0LIZIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onVideoStatusException:");
        sbLIZ2.append(i);
        C2188811AlT.LIZIZ(sbLIZ2);
        EnumC1471780oP2 enumC1471780oP2 = EnumC1471780oP2.INS;
        C1474420oTI c1474420oTI = this.LLILZ;
        EnumC1474270oT3 enumC1474270oT3 = EnumC1474270oT3.CONTROLLER_ON_STATUS_EXCEPTION;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("");
        sbLIZ3.append(i);
        enumC1471780oP2.trace(c1474420oTI, enumC1474270oT3, C2188811AlT.LIZIZ(sbLIZ3), Integer.valueOf(i), this.LLJJ);
        InterfaceC1487050onf interfaceC1487050onf = this.LLJILJIL;
        if (interfaceC1487050onf != null) {
            interfaceC1487050onf.LJJIIJ(this.LLJJ, this.LLILZ, i);
        }
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJ(boolean z) {
        this.LLJI = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b0  */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    @Override // X.InterfaceC2178671AOj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJI(boolean r9) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1474230oSz.LJJI(boolean):void");
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJIFFI(boolean z) {
        this.LLLIIIL = z;
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJIIZ(InterfaceC1474330oT9 interfaceC1474330oT9) {
        this.LLJILJILJ = interfaceC1474330oT9;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[PHI: r4
      0x008e: PHI (r4v3 X.0oTS) = (r4v1 X.0oTS), (r4v2 X.0oTS), (r4v4 X.0oTS) binds: [B:22:0x0071, B:24:0x0079, B:20:0x0069] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010f  */
    @Override // X.InterfaceC1467760oIY
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIIZI(X.C1470240oMY r9) {
        /*
            Method dump skipped, instruction units count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1474230oSz.LJJIIZI(X.0oMY):boolean");
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJIJIIJIL(InterfaceC1395140mPQ interfaceC1395140mPQ) {
        if (interfaceC1395140mPQ != null) {
            this.LLJJI = interfaceC1395140mPQ;
        }
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJIJL(boolean z) {
        this.LLJJJJ = z;
    }

    @Override // X.InterfaceC2178671AOj
    public final int LJJIJLIJ(boolean z) {
        if (z && this.LLJI) {
            TTVideoEngine tTVideoEngine = this.LLILLL;
            if (tTVideoEngine == null) {
                return 0;
            }
            return tTVideoEngine.LJJJJ();
        }
        TTVideoEngine tTVideoEngine2 = this.LLILLL;
        if (tTVideoEngine2 == null) {
            return 0;
        }
        return tTVideoEngine2.LJJJIL();
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJIL(InterfaceC1474390oTF interfaceC1474390oTF) {
        if (interfaceC1474390oTF != null) {
            this.LLJZIJLIL.LIZ = interfaceC1474390oTF;
        }
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJIZ(SurfaceHolder surfaceHolder) {
        if (this.LLILLJJLI != surfaceHolder) {
            this.LLILLJJLI = surfaceHolder;
            TTVideoEngine tTVideoEngine = this.LLILLL;
            if (tTVideoEngine != null) {
                tTVideoEngine.LLIZ(surfaceHolder);
            }
        }
    }

    @Override // X.InterfaceC1467780oIa
    public final void LJJJIL(C1467470oI5 c1467470oI5) {
        boolean z;
        if (c1467470oI5 == null) {
            return;
        }
        C1467470oI5 c1467470oI52 = new C1467470oI5();
        c1467470oI52.LIZ = c1467470oI5.LIZ;
        c1467470oI52.LIZIZ = c1467470oI5.LIZIZ;
        c1467470oI52.LIZJ = c1467470oI5.LIZJ;
        long j = c1467470oI5.LJ;
        if (j >= 0) {
            c1467470oI52.LJ = j;
        }
        String str = c1467470oI5.LIZLLL;
        if (!TextUtils.isEmpty(str) && !str.isEmpty()) {
            c1467470oI52.LIZLLL = str;
        }
        ((HashMap) this.LLLFF).put(c1467470oI52.LIZ, c1467470oI52);
        InterfaceC1487050onf interfaceC1487050onf = this.LLJILJIL;
        if (interfaceC1487050onf != null) {
            interfaceC1487050onf.LJ(this.LLJJ, this.LLILZ, c1467470oI52);
        }
        if (c1467470oI52.LIZ.equals("renderSeekComplete") && this.LLJILJIL != null) {
            Object obj = c1467470oI52.LIZJ;
            if ((obj instanceof Integer) && ((Integer) obj).intValue() > 0) {
                z = true;
            } else {
                z = false;
            }
            this.LLJILJIL.LJIIJ(this.LLJJ, this.LLILZ, z);
        }
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJJJ(int i) {
        this.LLILZIL = i;
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJJJI(boolean z) {
        this.LLJJIJIL = z;
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJJJL(int i) {
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LLILII(i);
        }
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJJJZ(boolean z) {
        this.LLJLIL = z;
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJJJZI(boolean z) {
        this.LLJIJIL = z;
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJJLL(TTVideoEngine tTVideoEngine) {
        TTVideoEngine tTVideoEngine2 = this.LLILLL;
        if (tTVideoEngine2 != null) {
            tTVideoEngine2.LIZ.LLLLLLZZ = null;
            tTVideoEngine2.LLJJI(null);
            this.LLILLL.LLJJIII(null);
            this.LLILLL.LLIIIJ(null);
            this.LLILLL.LLILLL(null);
        }
        this.LLILLL = tTVideoEngine;
        if (tTVideoEngine != null) {
            AbstractC1468760oKA abstractC1468760oKA = this.LLILZLL;
            if (abstractC1468760oKA != null) {
                tTVideoEngine.LIZ.LLLLLLZZ = abstractC1468760oKA;
            }
            tTVideoEngine.LLJJI(this);
            this.LLILLL.LLJJIII(this);
            this.LLILLL.LLIIIJ(this.LLLII);
            this.LLILLL.LLILLL(this.LLLIIII);
        }
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJLI(int i) {
        this.LLIZ = i;
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.LIZJ(4, i);
        }
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJLIIIJ(AbstractC1468760oKA abstractC1468760oKA) {
        this.LLILZLL = abstractC1468760oKA;
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJLIIIJILLIZJL(InterfaceC1487050onf interfaceC1487050onf) {
        this.LLJILJIL = interfaceC1487050onf;
    }

    public final void LJJLJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LJJLIL(C1473460oRk.LIZ(str), false);
    }

    public final void LJJLJLI(long j) {
        if (j > 0) {
            if (this.LLJLL) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("updateStartPlayPosition videoEngine.seekTo:");
                sbLIZ.append(j);
                sbLIZ.append(" vid:");
                sbLIZ.append(this.LLILZ.LIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                LJIIJ(j);
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("videoEngine.setStartTime:");
            sbLIZ2.append(j);
            sbLIZ2.append(" vid:");
            sbLIZ2.append(this.LLILZ.LIZ);
            C2188811AlT.LIZIZ(sbLIZ2);
            this.LLILLL.LLILII((int) j);
        }
    }

    public final void LJJLL(C1473400oRe c1473400oRe) {
        if (this.LLJILJIL != null && c1473400oRe != null) {
            for (EnumC2281151EQn enumC2281151EQn : EnumC2281151EQn.getAllResolutions()) {
                C1474520oTS c1474520oTSLJIIIZ = c1473400oRe.LJIIIZ(enumC2281151EQn, c1473400oRe.LJI(7), null);
                if (c1474520oTSLJIIIZ != null) {
                    int iLIZIZ = c1474520oTSLJIIIZ.LIZIZ(1);
                    if (c1474520oTSLJIIIZ.LIZIZ(2) > 0 && iLIZIZ > 0) {
                        this.LLJILJIL.LIZIZ(c1474520oTSLJIIIZ);
                        return;
                    }
                }
            }
        }
    }

    @Override // X.InterfaceC2178671AOj
    public final void setLoop(boolean z) {
        this.LLJ = z;
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null) {
            tTVideoEngine.setLooping(z);
        }
    }

    @Override // X.InterfaceC2178671AOj
    public final void setPlayEntity(C1474420oTI c1474420oTI) {
        this.LLILZ = c1474420oTI;
        this.LLJZIJLIL.getClass();
    }

    @Override // X.InterfaceC2178671AOj
    public final void setSurface(Surface surface) {
        if (this.LL != surface) {
            this.LL = surface;
            TTVideoEngine tTVideoEngine = this.LLILLL;
            if (tTVideoEngine != null) {
                int i = this.LLILZIL;
                if (i == 0) {
                    tTVideoEngine.setSurface(surface);
                } else {
                    if (i != 2) {
                        return;
                    }
                    tTVideoEngine.LLJ(surface);
                }
            }
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LIZJ(TTVideoEngine tTVideoEngine, int i) {
        String str;
        C1471760oP0 c1471760oP0LIZIZ = C1471760oP0.LIZIZ("PlayStateChanged", EnumC1474430oTJ.PLAY, 3);
        EnumC1471750oOz.INS.addTrace(this.LLILZ, c1471760oP0LIZIZ);
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        str = "";
                    } else {
                        LJJLIIIJLLLLLLLZ();
                        EnumC1471780oP2.INS.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_PLAY_STATE_ERROR, null, null, this.LLJJ);
                        str = "error";
                    }
                } else {
                    InterfaceC1487050onf interfaceC1487050onf = this.LLJILJIL;
                    if (interfaceC1487050onf != null) {
                        interfaceC1487050onf.LJJIIZ(this.LLJJ, this.LLILZ);
                    }
                    EnumC1471780oP2.INS.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_PLAY_STATE_PAUSED, null, null, this.LLJJ);
                    str = "paused";
                }
            } else {
                WeakHandler weakHandler = this.LLLIILIL;
                if (weakHandler != null) {
                    weakHandler.sendEmptyMessage(EnumC1474440oTK.UPDATE_PROGRESS.getWhat());
                }
                InterfaceC1487050onf interfaceC1487050onf2 = this.LLJILJIL;
                if (interfaceC1487050onf2 != null) {
                    interfaceC1487050onf2.LJJJJ(this.LLJJ, this.LLILZ);
                }
                EnumC1471780oP2.INS.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_PLAY_STATE_PLAYING, null, null, this.LLJJ);
                str = "playing";
            }
        } else {
            EnumC1471780oP2.INS.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_PLAY_STATE_STOPPED, null, null, this.LLJJ);
            str = "stopped";
        }
        if (c1471760oP0LIZIZ != null) {
            c1471760oP0LIZIZ.LIZ("state", str);
        }
        InterfaceC1487050onf interfaceC1487050onf3 = this.LLJILJIL;
        if (interfaceC1487050onf3 != null) {
            interfaceC1487050onf3.LJIIIIZZ(this.LLJJ, this.LLILZ, i);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
        C1471760oP0 c1471760oP0LIZIZ = C1471760oP0.LIZIZ("VCOnBitrateChanged", EnumC1474430oTJ.PLAY, 3);
        if (c1471760oP0LIZIZ != null) {
            if (enumC2281151EQn != null) {
                c1471760oP0LIZIZ.LIZ("resolution", enumC2281151EQn.toString());
            }
            EnumC1471750oOz.INS.addTrace(this.LLILZ, c1471760oP0LIZIZ);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onVideoStreamBitrateChanged resolution:");
        sbLIZ.append(enumC2281151EQn.toString());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LLLFZ = enumC2281151EQn;
        EnumC2281151EQn enumC2281151EQn2 = this.LLJJIJI;
        if (enumC2281151EQn2 != null) {
            this.LLJJIII = enumC2281151EQn2;
            this.LLJJIJI = null;
        }
        InterfaceC1487050onf interfaceC1487050onf = this.LLJILJIL;
        if (interfaceC1487050onf != null) {
            interfaceC1487050onf.LJIILLIIL(this.LLJJ, this.LLILZ, enumC2281151EQn, i);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIIL(TTVideoEngine tTVideoEngine, int i) {
        InterfaceC1487050onf interfaceC1487050onf = this.LLJILJIL;
        if (interfaceC1487050onf != null) {
            interfaceC1487050onf.LJIILL(this.LLJJ, this.LLILZ, i);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIJ(TTVideoEngine tTVideoEngine, int i) {
        String str;
        C1471760oP0 c1471760oP0LIZIZ = C1471760oP0.LIZIZ("OnLoadStateChanged", EnumC1474430oTJ.PLAY, 3);
        EnumC1471750oOz.INS.addTrace(this.LLILZ, c1471760oP0LIZIZ);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "";
                } else {
                    EnumC1471780oP2.INS.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_LOAD_STATE_ERROR, null, null, this.LLJJ);
                    str = "error";
                }
            } else {
                InterfaceC1487050onf interfaceC1487050onf = this.LLJILJIL;
                if (interfaceC1487050onf != null) {
                    interfaceC1487050onf.LJI(this.LLJJ, this.LLILZ);
                }
                if (this.LLJL) {
                    this.LLJJLIIIJLLLLLLLZ++;
                } else {
                    this.LLJL = true;
                }
                InterfaceC1487050onf interfaceC1487050onf2 = this.LLJILJIL;
                if (interfaceC1487050onf2 != null) {
                    interfaceC1487050onf2.LJJJJL(this.LLJJ, this.LLILZ, this.LLJJLIIIJLLLLLLLZ);
                }
                EnumC1471780oP2.INS.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_LOAD_STATE_STALLED, null, null, this.LLJJ);
                str = "stalled";
            }
        } else {
            InterfaceC1487050onf interfaceC1487050onf3 = this.LLJILJIL;
            if (interfaceC1487050onf3 != null) {
                interfaceC1487050onf3.LJJIIZI(this.LLJJ, this.LLILZ);
            }
            EnumC1471780oP2.INS.trace(this.LLILZ, EnumC1474270oT3.CONTROLLER_LOAD_STATE_PLAYABLE, null, null, this.LLJJ);
            str = "playable";
        }
        if (c1471760oP0LIZIZ != null) {
            c1471760oP0LIZIZ.LIZ("state", str);
        }
        InterfaceC1487050onf interfaceC1487050onf4 = this.LLJILJIL;
        if (interfaceC1487050onf4 != null) {
            interfaceC1487050onf4.LJIJI(this.LLJJ, this.LLILZ, i);
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIJI(TTVideoEngine tTVideoEngine, int i) {
        EnumC2281151EQn enumC2281151EQn;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onStreamChanged type:");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        C1471760oP0 c1471760oP0LIZIZ = C1471760oP0.LIZIZ("VCOnStreamChanged", EnumC1474430oTJ.PLAY, 3);
        if (c1471760oP0LIZIZ != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("");
            sbLIZ2.append(i);
            c1471760oP0LIZIZ.LIZ("type", C2188811AlT.LIZIZ(sbLIZ2));
            EnumC1471750oOz.INS.addTrace(this.LLILZ, c1471760oP0LIZIZ);
        }
        if (i == 0 && (enumC2281151EQn = this.LLJJIJI) != null) {
            this.LLJJIII = enumC2281151EQn;
            this.LLJJIJI = null;
        }
        InterfaceC1487050onf interfaceC1487050onf = this.LLJILJIL;
        if (interfaceC1487050onf != null) {
            interfaceC1487050onf.LJIL(this.LLJJ, this.LLILZ, i);
        }
    }

    @Override // X.InterfaceC2178671AOj
    public final void LJJIII(EnumC2281151EQn enumC2281151EQn, boolean z) {
        LJJLIL(enumC2281151EQn, z);
    }

    public final void LJJLIL(EnumC2281151EQn enumC2281151EQn, boolean z) {
        boolean z2;
        String str;
        if (enumC2281151EQn == null) {
            return;
        }
        boolean z3 = false;
        if (this.LLJJIII != enumC2281151EQn) {
            C1471760oP0 c1471760oP0LIZIZ = C1471760oP0.LIZIZ("SetResolution", EnumC1474430oTJ.PLAY, 6);
            if (c1471760oP0LIZIZ != null) {
                c1471760oP0LIZIZ.LIZ("resolution", enumC2281151EQn.toString());
                EnumC1471750oOz.INS.addTrace(this.LLILZ, c1471760oP0LIZIZ);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJJIJI = enumC2281151EQn;
        if (this.LLJJIII == null) {
            this.LLJJIII = enumC2281151EQn;
        }
        EnumC2281151EQn enumC2281151EQn2 = EnumC2281151EQn.Auto;
        if (enumC2281151EQn == enumC2281151EQn2) {
            this.LLJJIII = enumC2281151EQn2;
        } else if (this.LLJJIII == enumC2281151EQn2 && enumC2281151EQn == this.LLLFZ) {
            this.LLJJIII = enumC2281151EQn;
        }
        InterfaceC1487050onf interfaceC1487050onf = this.LLJILJIL;
        if (interfaceC1487050onf != null && z2) {
            interfaceC1487050onf.LJIJJLI(this.LLJJ, this.LLILZ, enumC2281151EQn, z);
        }
        TTVideoEngine tTVideoEngine = this.LLILLL;
        if (tTVideoEngine != null) {
            if (enumC2281151EQn == enumC2281151EQn2) {
                tTVideoEngine.LIZJ(29, 1);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setResolution:");
                sbLIZ.append(enumC2281151EQn);
                sbLIZ.append(" title:");
                if (this.LLILZ == null) {
                    str = "entity null";
                } else {
                    str = null;
                }
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                this.LLILLL.LJIILIIL(enumC2281151EQn);
            }
            if (enumC2281151EQn == enumC2281151EQn2) {
                z3 = true;
            }
            this.LLJLLL = z3;
        }
    }

    @Override // X.InterfaceC1469360oL8
    public final void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
        InterfaceC1487050onf interfaceC1487050onf = this.LLJILJIL;
        if (interfaceC1487050onf != null) {
            interfaceC1487050onf.LJJIFFI(this.LLJJ, this.LLILZ, i, i2);
        }
    }
}
