package X;

import Y.AObjectS14S1101000_32;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.scene.Scene;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.18jO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21365618jO {
    public final SparseArray<C21365218jK> LIZ;
    public final C21365118jJ LIZIZ;

    public C21365618jO(final C19EG c19eg, InterfaceC1624480sNK interfaceC1624480sNK, final InterfaceC21366018jS interfaceC21366018jS, Function2 function2, Function1 function1, Scene scene) {
        SparseArray<C21365218jK> sparseArray = new SparseArray<>();
        this.LIZ = sparseArray;
        sparseArray.put(0, new C21365218jK(c19eg, interfaceC21366018jS) { // from class: X.18jQ
            @Override // X.C21365218jK
            public final void LIZJ(C21359318iN c21359318iN) {
                this.LIZ = c21359318iN;
                c21359318iN.setEffectTextChangeListener(new InterfaceC21359018iK() { // from class: X.18jU
                    @Override // X.InterfaceC21359018iK
                    public final void LIZ(String str) {
                    }

                    @Override // X.InterfaceC21359018iK
                    public final void LIZIZ(String str) {
                        C21365818jQ c21365818jQ = this.LIZ;
                        if (c21365818jQ.LJI) {
                            c21365818jQ.LJ(str);
                        }
                    }
                });
            }

            @Override // X.C21365218jK
            public final void LIZLLL(int i, String str) {
                this.LIZJ.LIZ(new AObjectS14S1101000_32(this, i, str, 0));
            }
        });
        sparseArray.put(1, new C21365218jK(c19eg, interfaceC21366018jS) { // from class: X.18jN
            @Override // X.C21365218jK
            public final void LIZIZ() {
                InterfaceC21366018jS interfaceC21366018jS2;
                C21366118jT c21366118jT;
                if (TextUtils.isEmpty(this.LJIIIIZZ) || (interfaceC21366018jS2 = this.LIZJ) == null || (c21366118jT = this.LIZLLL) == null) {
                    return;
                }
                interfaceC21366018jS2.LJLJJL(c21366118jT.LIZIZ, c21366118jT.LIZJ, this.LJIIIIZZ, c21366118jT.LIZLLL);
                this.LIZJ.LJLJJI();
            }

            @Override // X.C21365218jK
            public final void LIZJ(C21359318iN c21359318iN) {
                c21359318iN.setEffectTextChangeListener(new InterfaceC21359018iK() { // from class: X.18jP
                    @Override // X.InterfaceC21359018iK
                    public final void LIZ(String str) {
                        C21365518jN c21365518jN = this.LIZ;
                        c21365518jN.LJIIIIZZ = str;
                        c21365518jN.LIZJ.LJLJJI();
                        C21365518jN c21365518jN2 = this.LIZ;
                        InterfaceC21366018jS interfaceC21366018jS2 = c21365518jN2.LIZJ;
                        C21366118jT c21366118jT = c21365518jN2.LIZLLL;
                        interfaceC21366018jS2.LJLJJL(c21366118jT.LIZIZ, c21366118jT.LIZJ, str, c21366118jT.LIZLLL);
                    }

                    @Override // X.InterfaceC21359018iK
                    public final void LIZIZ(String str) {
                        C21365518jN c21365518jN = this.LIZ;
                        if (c21365518jN.LJI) {
                            c21365518jN.LJ(str);
                        }
                    }
                });
                super.LIZJ(c21359318iN);
            }

            @Override // X.C21365218jK
            public final void LIZLLL(int i, String str) {
                this.LIZJ.LIZ(new AObjectS14S1101000_32(this, i, str, 1));
            }
        });
        sparseArray.put(2, new C21365418jM(c19eg, interfaceC21366018jS, function2));
        this.LIZIZ = new C21365118jJ(interfaceC1624480sNK, sparseArray, c19eg, function1, scene);
    }
}
