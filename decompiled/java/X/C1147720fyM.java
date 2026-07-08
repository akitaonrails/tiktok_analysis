package X;

import com.bytedance.android.livesdk.comp.impl.musicgift.data.network.MusicGiftRetrofitApi;
import com.bytedance.android.livesdk.gift.model.MusicGiftMoodsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0fyM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.musicgift.data.repository.MusicGiftRepository$fetchMoods$1", f = "MusicGiftRepository.kt", l = {37}, m = "invokeSuspend")
public final class C1147720fyM extends C09AX implements Function1<InterfaceC1364105Vn<? super C470590Icr<MusicGiftMoodsResponse.Data>>, Object> {
    public int LL;
    public final /* synthetic */ C1147690fyJ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1147720fyM(C1147690fyJ c1147690fyJ, InterfaceC1364105Vn<? super C1147720fyM> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1147690fyJ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1147720fyM(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C470590Icr<MusicGiftMoodsResponse.Data>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MusicGiftRepository@a574.fetchMoods$1");
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
            MusicGiftRetrofitApi musicGiftRetrofitApi = this.LLILLJJLI.LIZ;
            this.LL = 1;
            obj = musicGiftRetrofitApi.getMusicGiftMoods(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MusicGiftRepository@a574.fetchMoods$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MusicGiftRepository@a574.fetchMoods$1");
        return obj;
    }
}
