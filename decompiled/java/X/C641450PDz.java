package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioViewModel$fetchData$1$1$onDownloadSuccess$2", f = "ReuseAudioViewModel.kt", l = {136}, m = "invokeSuspend")
public final class C641450PDz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public MutableLiveData LL;
    public int LLILLJJLI;
    public final /* synthetic */ ReuseAudioViewModel LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C641450PDz(ReuseAudioViewModel reuseAudioViewModel, String str, InterfaceC1364105Vn<? super C641450PDz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = reuseAudioViewModel;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C641450PDz(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        MutableLiveData mutableLiveData;
        C1C7U.LIZ("ReuseAudioViewModel@995a.fetchData$1$1$onDownloadSuccess$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                MutableLiveData mutableLiveData2 = this.LL;
                C155000ia.LIZIZ(obj);
                mutableLiveData = mutableLiveData2;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            MutableLiveData<Integer> mutableLiveData3 = this.LLILLL.LLILLL;
            C1DFB c1dfb = C0PEM.LIZJ;
            C0PE0 c0pe0 = new C0PE0(this.LLILZ, null);
            this.LL = mutableLiveData3;
            this.LLILLJJLI = 1;
            obj = C23250099c.LJI(this, c1dfb, c0pe0);
            mutableLiveData = mutableLiveData3;
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ReuseAudioViewModel@995a.fetchData$1$1$onDownloadSuccess$2");
                return objLJFF;
            }
        }
        mutableLiveData.postValue(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReuseAudioViewModel@995a.fetchData$1$1$onDownloadSuccess$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
