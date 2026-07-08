package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.android.davinciresource.jni.DAVUnZipFunc;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.AwS145S0101000_5;
import kotlin.jvm.internal.AwS34S1101000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS89S0210000_5;

/* JADX INFO: renamed from: X.0Dze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357320Dze implements InterfaceC356750Dyj {
    public InterfaceC356810Dyp LIZJ;
    public final C357420Dzo LIZ = new C357420Dzo();
    public final C354560DvC LIZIZ = new C354560DvC();
    public String LIZLLL = "";

    @Override // X.InterfaceC356750Dyj
    public final void clear() {
        this.LIZJ = null;
        this.LIZ.getClass();
        ((InterfaceC357410Dzn) C366380EYa.LJ.getValue()).clear();
        LJ();
    }

    @Override // X.InterfaceC356750Dyj
    public final void Hs() {
        InterfaceC354440Dv0 interfaceC354440Dv0;
        synchronized (this.LIZLLL) {
            try {
                this.LIZLLL = "";
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LIZJ = null;
        this.LIZ.getClass();
        ((InterfaceC357410Dzn) C366380EYa.LJ.getValue()).cancelCompile();
        LJ();
        for (Object obj : this.LIZIZ.LIZ) {
            if ((obj instanceof InterfaceC354440Dv0) && (interfaceC354440Dv0 = (InterfaceC354440Dv0) obj) != null) {
                interfaceC354440Dv0.LIZIZ();
            }
        }
    }

    public final void LJ() {
        InterfaceC354500Dv6 interfaceC354500Dv6;
        for (Object obj : this.LIZIZ.LIZ) {
            if ((obj instanceof InterfaceC354500Dv6) && (interfaceC354500Dv6 = (InterfaceC354500Dv6) obj) != null) {
                interfaceC354500Dv6.LIZ();
            }
        }
    }

    @Override // X.InterfaceC356750Dyj
    public final void LIZ(List<? extends AbstractC354420Duy> list) {
        this.LIZIZ.LIZ.clear();
        this.LIZIZ.LIZ.addAll(list);
    }

    @Override // X.InterfaceC356750Dyj
    public final void LIZJ(C354240Dug c354240Dug) {
        this.LIZIZ.LIZ(new C354540DvA(EnumC356390Dy9.REMOVE, c354240Dug, null), null);
    }

    @Override // X.InterfaceC356750Dyj
    public final void LIZIZ(final C354240Dug c354240Dug, InterfaceC356810Dyp interfaceC356810Dyp) {
        this.LIZJ = interfaceC356810Dyp;
        C0E00 c0e00 = c354240Dug.LIZ.LJFF;
        if (c0e00 != null) {
            if (c0e00 == C0E00.COMBINE_GAME_PLAY) {
                this.LIZLLL = UUID.randomUUID().toString();
                C357420Dzo.LIZ(c354240Dug, new C357350Dzh(this, c354240Dug));
            } else {
                C357420Dzo.LIZ(c354240Dug, new InterfaceC20343514iv() { // from class: X.0Dzi
                    @Override // X.InterfaceC20343514iv
                    public final void onStart() {
                        C383980F3s.LIZIZ(new AwS549S0100000_5(this.LIZ, 1288));
                    }

                    @Override // X.InterfaceC20343514iv
                    public final void LIZ(NLETimeSpaceNode nLETimeSpaceNode) {
                        NLETemplateModel nLETemplateModel;
                        C383980F3s.LIZIZ(new AwS549S0100000_5(this.LIZ, 1289));
                        if ((nLETimeSpaceNode instanceof NLETemplateModel) && (nLETemplateModel = (NLETemplateModel) nLETimeSpaceNode) != null) {
                            C354540DvA c354540DvA = new C354540DvA(EnumC356390Dy9.APPLY, c354240Dug, nLETemplateModel);
                            final C357320Dze c357320Dze = this.LIZ;
                            c357320Dze.LIZIZ.LIZ(c354540DvA, new InterfaceC354020DuK() { // from class: X.0Dzj
                                @Override // X.InterfaceC354020DuK
                                public final void onProgress(int i) {
                                }

                                @Override // X.InterfaceC354020DuK
                                public final void LIZ(C354570DvD c354570DvD) {
                                    C383980F3s.LIZIZ(new AwS89S0210000_5(c354570DvD.LIZ, c357320Dze, c354570DvD, 3));
                                }
                            });
                            return;
                        }
                        C383980F3s.LIZIZ(new AwS549S0100000_5(this.LIZ, 1290));
                    }

                    @Override // X.InterfaceC20343514iv
                    public final void onProgress(int i) {
                        C383980F3s.LIZIZ(new AwS145S0101000_5(this.LIZ, i, 9));
                    }

                    @Override // X.InterfaceC20343514iv
                    public final void onError(int i, String str) {
                        C383980F3s.LIZIZ(new AwS34S1101000_5(this.LIZ, i, str, 2));
                    }
                });
            }
        }
    }

    @Override // X.InterfaceC356750Dyj
    public final void LIZLLL(Context context, C357530Dzz c357530Dzz, DAVUnZipFunc dAVUnZipFunc) {
        C357420Dzo.LIZIZ(context, c357530Dzz, dAVUnZipFunc);
    }
}
