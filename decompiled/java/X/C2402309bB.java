package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.ecommerce.base.selector.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS617S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.09bB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.selector.MvChooseAlbumFragment$loadDataV2$1$1", f = "MvChooseAlbumFragment.kt", l = {}, m = "invokeSuspend")
public final class C2402309bB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C20639615pa LL;
    public final /* synthetic */ List<MediaModel> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2402309bB(C20639615pa c20639615pa, List<? extends MediaModel> list, InterfaceC1364105Vn<? super C2402309bB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c20639615pa;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2402309bB(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C20600815jK<InterfaceC1891350zJl> state;
        C1C7U.LIZ("MvChooseAlbumFragment@b589.loadDataV2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20639615pa c20639615pa = this.LL;
        List<MediaModel> list = this.LLILLJJLI;
        if (c20639615pa.mActivity != null) {
            ArrayList<MediaModel> arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            for (MediaModel mediaModel : list) {
                if (mediaModel.LJFF() != null && !TextUtils.isEmpty(mediaModel.LJFF())) {
                    TikTokMediaModel.Companion.getClass();
                    TikTokMediaModel tikTokMediaModel = new TikTokMediaModel(mediaModel.id);
                    tikTokMediaModel.LJIILL(mediaModel.LJFF());
                    tikTokMediaModel.relativePath = mediaModel.relativePath;
                    tikTokMediaModel.fileName = mediaModel.fileName;
                    tikTokMediaModel.localUri = mediaModel.localUri;
                    tikTokMediaModel.albumClass = mediaModel.albumClass;
                    tikTokMediaModel.date = mediaModel.date;
                    tikTokMediaModel.type = mediaModel.type;
                    tikTokMediaModel.subType = mediaModel.subType;
                    tikTokMediaModel.duration = mediaModel.duration;
                    tikTokMediaModel.fileSize = mediaModel.fileSize;
                    String str = mediaModel.mimeType;
                    if (str != null) {
                        tikTokMediaModel.mimeType = str;
                    }
                    tikTokMediaModel.thumbnail = mediaModel.thumbnail;
                    tikTokMediaModel.width = mediaModel.width;
                    tikTokMediaModel.height = mediaModel.height;
                    tikTokMediaModel.modify = mediaModel.modify;
                    tikTokMediaModel.aigcInfo = mediaModel.aigcInfo;
                    hashSet.add(((MediaModel) tikTokMediaModel).id);
                    arrayList.add(tikTokMediaModel);
                }
            }
            c20639615pa.LLJJJJJIL.clear();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C2402509bD(c20639615pa.LLJJJIL, new LinkedHashSet(arrayList), new AwS617S0100000_3(c20639615pa, 26)));
            for (MediaModel mediaModel2 : arrayList) {
                String str2 = mediaModel2.albumClass;
                if (TextUtils.isEmpty(str2)) {
                    str2 = "";
                }
                C2402509bD c2402509bD = c20639615pa.LLJJJJJIL.get(str2);
                if (c2402509bD == null) {
                    c2402509bD = new C2402509bD(str2, new LinkedHashSet(), new AwS617S0100000_3(c20639615pa, 25));
                    arrayList2.add(c2402509bD);
                    c20639615pa.LLJJJJJIL.put(str2, c2402509bD);
                }
                c2402509bD.LLILLJJLI.add((TikTokMediaModel) mediaModel2);
            }
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = c20639615pa.LLJJIJIIJIL;
            Object obj2 = null;
            if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
                state.LJIILL(arrayList2, null);
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.LJFF(((C2402509bD) next).LL, c20639615pa.LLJJJJLIIL)) {
                    obj2 = next;
                    break;
                }
            }
            C2402509bD c2402509bD2 = (C2402509bD) obj2;
            if (c2402509bD2 != null || (c2402509bD2 = (C2402509bD) C13LP.LJJJLZIJ(0, arrayList2)) != null) {
                c20639615pa.LLLLIILL(c2402509bD2, false);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MvChooseAlbumFragment@b589.loadDataV2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
