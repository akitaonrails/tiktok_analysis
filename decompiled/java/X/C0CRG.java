package X;

import Y.ARunnableS1S1101000_4;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.vesdk.VEUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CRG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.common.utils.VEUtilsWrapper$asyncGetMusicDuration$1", f = "VEUtilsWrapper.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C0CRG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<Integer, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0CRG(String str, Function1<? super Integer, Unit> function1, InterfaceC1364105Vn<? super C0CRG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CRG(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C1C7U.LIZ("VEUtilsWrapper@b772.asyncGetMusicDuration$1");
        Object objLJFF = C099R.LJFF();
        int i2 = this.LL;
        if (i2 != 0) {
            if (i2 == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0CRH c0crh = C0CRH.LL;
            String str = this.LLILLJJLI;
            this.LL = 1;
            c0crh.getClass();
            obj = VEUtils.getAudioFileInfo(str);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VEUtilsWrapper@b772.asyncGetMusicDuration$1");
                return objLJFF;
            }
        }
        VEUtils.VEAudioFileInfo vEAudioFileInfo = (VEUtils.VEAudioFileInfo) obj;
        if (vEAudioFileInfo != null) {
            i = vEAudioFileInfo.duration;
        } else {
            i = 0;
        }
        C786410Ut5.LJJZZIII(C0CRH.LLILLL, new ARunnableS1S1101000_4(i, this.LLILLJJLI, this.LLILLL, 1));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VEUtilsWrapper@b772.asyncGetMusicDuration$1");
        return unit;
    }
}
