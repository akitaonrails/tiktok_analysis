package X;

import android.content.Context;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.vesdk.VEEditor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS119S1100000_5;
import njp.a;

/* JADX INFO: renamed from: X.0Drq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.templatedownload.ResizeMediasManager$resizeSingleMedia$job$1", f = "ResizeMediasManager.kt", l = {240}, m = "invokeSuspend")
public final class C352480Drq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C2473609mg LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ int[] LLIZLLLIL;
    public final /* synthetic */ int[] LLJ;
    public final /* synthetic */ NLETrackSlot LLJI;
    public final /* synthetic */ C259800zU<VEEditor> LLJIJIL;
    public final /* synthetic */ String LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C352480Drq(boolean z, Context context, String str, String str2, C2473609mg c2473609mg, String str3, int[] iArr, int[] iArr2, NLETrackSlot nLETrackSlot, C259800zU<VEEditor> c259800zU, String str4, InterfaceC1364105Vn<? super C352480Drq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = c2473609mg;
        this.LLIZ = str3;
        this.LLIZLLLIL = iArr;
        this.LLJ = iArr2;
        this.LLJI = nLETrackSlot;
        this.LLJIJIL = c259800zU;
        this.LLJILJIL = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C352480Drq(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String path;
        C1C7U.LIZ("ResizeMediasManager@4d3.resizeSingleMedia$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (this.LLILLJJLI) {
                C352470Drp c352470Drp = C352470Drp.LIZ;
                Context context = this.LLILLL;
                String str = this.LLILZ;
                String str2 = this.LLILZIL;
                C2473609mg c2473609mg = this.LLILZLL;
                c352470Drp.getClass();
                C0VSJ c0vsjLJJIJLIJ = C2471909mP.LIZ.LJJIJLIJ(str);
                if (c0vsjLJJIJLIJ == null || (path = c0vsjLJJIJLIJ.getPath()) == null) {
                    path = str;
                }
                if (C309720CCc.LIZ(C2471909mP.LJIJI(path))) {
                    boolean zLIZJ = C2471909mP.LIZJ(str, str2);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("resizeSingleImage skip compress: inputPath = ");
                    sbLIZ.append(str);
                    sbLIZ.append(", outPath = ");
                    sbLIZ.append(str2);
                    sbLIZ.append(", copied = ");
                    sbLIZ.append(zLIZJ);
                    C352470Drp.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                    C352470Drp.LIZIZ.remove(str);
                } else {
                    InterfaceC352560Dry interfaceC352560Dry = new InterfaceC352560Dry() { // from class: X.0Drs
                        @Override // X.InterfaceC352560Dry
                        public final void LIZJ(C352570Drz c352570Drz) {
                        }

                        @Override // X.InterfaceC352560Dry
                        public final void onProgress(float f) {
                        }

                        @Override // X.InterfaceC352560Dry
                        public final void LIZIZ(String str3, String str4) {
                            C352470Drp c352470Drp2 = C352470Drp.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("resizeSingleImage onCancel: inputPath = ");
                            sbLIZ2.append(str3);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            c352470Drp2.getClass();
                            C352470Drp.LIZLLL(strLIZIZ);
                            C352470Drp.LIZIZ.remove(str3);
                        }

                        @Override // X.InterfaceC352560Dry
                        public final void LJJI(String str3, String str4) {
                            C352470Drp c352470Drp2 = C352470Drp.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("resizeSingleImage onSuccess: inputPath = ");
                            sbLIZ2.append(str3);
                            sbLIZ2.append(", outputPath = ");
                            sbLIZ2.append(str4);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            c352470Drp2.getClass();
                            C352470Drp.LIZLLL(strLIZIZ);
                            C352470Drp.LIZIZ.remove(str3);
                        }

                        @Override // X.InterfaceC352560Dry
                        public final void LIZ(String str3, String str4, String str5) {
                            C352470Drp c352470Drp2 = C352470Drp.LIZ;
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("resizeSingleImage onError: inputPath = ");
                            sbLIZ2.append(str3);
                            sbLIZ2.append(", errorInfo = ");
                            sbLIZ2.append(str5);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            c352470Drp2.getClass();
                            C352470Drp.LIZLLL(strLIZIZ);
                            C352470Drp.LIZIZ.remove(str3);
                        }
                    };
                    C539510LDx.LIZ.getClass();
                    C539510LDx.LIZ(context, str, 1080, 1080, interfaceC352560Dry, str2, c2473609mg);
                }
            } else {
                C352470Drp c352470Drp2 = C352470Drp.LIZ;
                Context context2 = this.LLILLL;
                String str3 = this.LLIZ;
                String str4 = this.LLILZ;
                String str5 = this.LLILZIL;
                int[] iArr = this.LLIZLLLIL;
                int[] iArr2 = this.LLJ;
                String uuid = this.LLJI.getUUID();
                AwS119S1100000_5 awS119S1100000_5 = new AwS119S1100000_5(this.LLJILJIL, this.LLJIJIL, 10);
                this.LL = 1;
                c352470Drp2.getClass();
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                final AwS119S1100000_5 awS119S1100000_52 = new AwS119S1100000_5(uuid, c23260099m, 11);
                InterfaceC352560Dry interfaceC352560Dry2 = new InterfaceC352560Dry() { // from class: X.0Drr
                    @Override // X.InterfaceC352560Dry
                    public final void LIZJ(C352570Drz c352570Drz) {
                    }

                    @Override // X.InterfaceC352560Dry
                    public final void onProgress(float f) {
                    }

                    @Override // X.InterfaceC352560Dry
                    public final void LIZIZ(String str6, String str7) {
                        C352470Drp c352470Drp3 = C352470Drp.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("resizeSingleVideo onCancel: inputPath = ");
                        sbLIZ2.append(str6);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        c352470Drp3.getClass();
                        C352470Drp.LIZLLL(strLIZIZ);
                        awS119S1100000_52.invoke(str6);
                    }

                    @Override // X.InterfaceC352560Dry
                    public final void LJJI(String str6, String str7) {
                        C352470Drp c352470Drp3 = C352470Drp.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("resizeSingleVideo onSuccess: inputPath = ");
                        sbLIZ2.append(str6);
                        sbLIZ2.append(", outputPath = ");
                        sbLIZ2.append(str7);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        c352470Drp3.getClass();
                        C352470Drp.LIZLLL(strLIZIZ);
                        awS119S1100000_52.invoke(str6);
                    }

                    @Override // X.InterfaceC352560Dry
                    public final void LIZ(String str6, String str7, String str8) {
                        C352470Drp c352470Drp3 = C352470Drp.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("resizeSingleVideo onError: inputPath = ");
                        sbLIZ2.append(str6);
                        sbLIZ2.append(", errorInfo = ");
                        sbLIZ2.append(str8);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                        c352470Drp3.getClass();
                        C352470Drp.LIZLLL(strLIZIZ);
                        awS119S1100000_52.invoke(str6);
                    }
                };
                C539510LDx.LIZ.getClass();
                awS119S1100000_5.invoke(C539510LDx.LIZLLL(context2, str4, 1080, 1080, interfaceC352560Dry2, str5, str3, null, iArr, iArr2));
                Object objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLIZ != C099R.LJFF()) {
                    objLIZ = Unit.LIZ;
                }
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("ResizeMediasManager@4d3.resizeSingleMedia$job$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ResizeMediasManager@4d3.resizeSingleMedia$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
