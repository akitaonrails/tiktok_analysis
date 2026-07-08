package X;

import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailPageDialogFragment;
import com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.ui.detail.MusicGiftDetailPageDialogFragment$onViewCreated$2$2$1", f = "MusicGiftDetailPageDialogFragment.kt", l = {147}, m = "invokeSuspend")
public final class C1147210fxX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MusicGiftDetailViewModel LLILLJJLI;
    public final /* synthetic */ MusicGiftDetailPageDialogFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147210fxX(MusicGiftDetailViewModel musicGiftDetailViewModel, MusicGiftDetailPageDialogFragment musicGiftDetailPageDialogFragment, InterfaceC1364105Vn<? super C1147210fxX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = musicGiftDetailViewModel;
        this.LLILLL = musicGiftDetailPageDialogFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1147210fxX(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftDetailPageDialogFragment@8cda.onViewCreated$2$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            AnonymousClass0951 anonymousClass0951 = this.LLILLJJLI.LLIZLLLIL;
            final MusicGiftDetailPageDialogFragment musicGiftDetailPageDialogFragment = this.LLILLL;
            InterfaceC346701Wf interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0fxW
                @Override // X.InterfaceC346701Wf
                public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                    C1396005dG c1396005dG = (C1396005dG) obj2;
                    C1DUN c1dun = musicGiftDetailPageDialogFragment.LLJZ;
                    if (c1dun != null) {
                        c1dun.LLILZ = c1396005dG;
                        C1147340fxk c1147340fxk = c1dun.LLILLL;
                        if (c1147340fxk != null) {
                            if (c1dun.LLILZIL) {
                                c1dun.LJFF(false);
                            } else {
                                c1dun.LL.setUniforms(c1dun.LIZ(c1147340fxk, c1dun.LLILZ.LIZJ, 0.0f, 0.0f, 0.0f));
                            }
                        }
                    }
                    return Unit.LIZ;
                }
            };
            this.LL = 1;
            if (anonymousClass0951.collect(interfaceC346701Wf, this) == objLJFF) {
                C1C7U.LIZIZ("MusicGiftDetailPageDialogFragment@8cda.onViewCreated$2$2$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
