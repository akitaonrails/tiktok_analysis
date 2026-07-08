package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.120j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.aweme.choosemusic.fragment.LocalMusicTabFragment$loadWithDialog$2", f = "LocalMusicTabFragment.kt", l = {}, m = "invokeSuspend")
public final class C196859120j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LocalMusicTabFragment LL;
    public final /* synthetic */ Context LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C196859120j(LocalMusicTabFragment localMusicTabFragment, Context context, InterfaceC1364105Vn<? super C196859120j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = localMusicTabFragment;
        this.LLILLJJLI = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C196859120j(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LocalMusicTabFragment@d523.loadWithDialog$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MusicModel[] musicModelArrWR = this.LL.WR();
        this.LL.LLJJJJJIL.storeInt("imported_device_sounds_size", musicModelArrWR.length);
        ArrayList arrayList = new ArrayList();
        for (MusicModel musicModel : musicModelArrWR) {
            if ((musicModel.getMusicType() == 0 || musicModel.getMusicType() == 3) && !C15KM.LIZJ(this.LLILLJJLI, UriProtector.parse(musicModel.getLocalPath())) && !C1487190ont.LIZ(musicModel.getLocalPath())) {
                ((HashSet) ((C20494715Hl) this.LL.NR()).LLJJJJ).add(musicModel.getLocalPath());
            }
            arrayList.add(musicModel);
        }
        this.LL.iS(arrayList, true);
        LocalMusicTabFragment localMusicTabFragment = this.LL;
        localMusicTabFragment.LLJJIII = true;
        ProgressDialogC1399760mWs progressDialogC1399760mWs = localMusicTabFragment.LLJJJJ;
        if (progressDialogC1399760mWs != null) {
            progressDialogC1399760mWs.dismiss();
            C785410UrT.LIZ(progressDialogC1399760mWs);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LocalMusicTabFragment@d523.loadWithDialog$2");
        return unit;
    }
}
