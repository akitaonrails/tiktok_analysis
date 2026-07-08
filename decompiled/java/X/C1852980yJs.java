package X;

import android.content.Context;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowViewModel;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS393S0200000_27;
import kotlin.jvm.internal.AwS641S0100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0yJs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.menuwindow.TakoMenuWindowViewModel$loadPhotos$1$2", f = "TakoMenuWindowViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1852980yJs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ TakoMenuWindowViewModel LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ List<MediaModel> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1852980yJs(TakoMenuWindowViewModel takoMenuWindowViewModel, Context context, List<? extends MediaModel> list, InterfaceC1364105Vn<? super C1852980yJs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoMenuWindowViewModel;
        this.LLILLJJLI = context;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1852980yJs(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoMenuWindowViewModel@a05a.loadPhotos$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        TakoMenuWindowViewModel takoMenuWindowViewModel = this.LL;
        List<MediaModel> list = this.LLILLL;
        takoMenuWindowViewModel.getClass();
        ArrayList<MediaModel> arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (MediaModel mediaModel : list) {
            if (mediaModel.LJFF() != null && !TextUtils.isEmpty(mediaModel.LJFF()) && !TextUtils.isEmpty(mediaModel.albumClass)) {
                TikTokMediaModel.Companion.getClass();
                TikTokMediaModel tikTokMediaModelLIZ = C527260Km4.LIZ(mediaModel);
                hashSet.add(((MediaModel) tikTokMediaModelLIZ).id);
                arrayList.add(tikTokMediaModelLIZ);
            }
        }
        takoMenuWindowViewModel.LLJI.clear();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C1163730gOB((String) takoMenuWindowViewModel.LLJIJIL.getValue(), new LinkedHashSet(arrayList), new AwS641S0100000_27(takoMenuWindowViewModel, 104)));
        for (MediaModel mediaModel2 : arrayList) {
            String str = mediaModel2.albumClass;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            C1163730gOB c1163730gOB = takoMenuWindowViewModel.LLJI.get(str);
            if (c1163730gOB == null) {
                c1163730gOB = new C1163730gOB(str, new LinkedHashSet(), new AwS641S0100000_27(takoMenuWindowViewModel, 103));
                arrayList2.add(c1163730gOB);
                takoMenuWindowViewModel.LLJI.put(str, c1163730gOB);
            }
            c1163730gOB.LLILLJJLI.add((TikTokMediaModel) mediaModel2);
        }
        takoMenuWindowViewModel.withState(new AwS393S0200000_27(takoMenuWindowViewModel, (TakoMenuWindowViewModel) arrayList2, (ArrayList<C1163730gOB>) 104));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoMenuWindowViewModel@a05a.loadPhotos$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
