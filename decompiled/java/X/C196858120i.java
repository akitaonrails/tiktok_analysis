package X;

import com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.120i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment$onCollect$1", f = "LocalMusicTabFragment.kt", l = {}, m = "invokeSuspend")
public final class C196858120i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LocalMusicTabFragment LL;
    public final /* synthetic */ ArrayList<MusicModel> LLILLJJLI;
    public final /* synthetic */ ProgressDialogC1399760mWs LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C196858120i(LocalMusicTabFragment localMusicTabFragment, ArrayList<MusicModel> arrayList, ProgressDialogC1399760mWs progressDialogC1399760mWs, InterfaceC1364105Vn<? super C196858120i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = localMusicTabFragment;
        this.LLILLJJLI = arrayList;
        this.LLILLL = progressDialogC1399760mWs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C196858120i(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LocalMusicTabFragment@d523.onCollect$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLJJJ.clear();
        ArrayList arrayList = new ArrayList(this.LLILLJJLI);
        C19719612Di.LJJII(arrayList, this.LL.WR());
        this.LL.hS(arrayList);
        ProgressDialogC1399760mWs progressDialogC1399760mWs = this.LLILLL;
        progressDialogC1399760mWs.dismiss();
        C785410UrT.LIZ(progressDialogC1399760mWs);
        this.LL.LLJJJ.addAll(arrayList);
        LocalMusicTabFragment localMusicTabFragment = this.LL;
        localMusicTabFragment.aS(localMusicTabFragment.LLJJIJI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LocalMusicTabFragment@d523.onCollect$1");
        return unit;
    }
}
