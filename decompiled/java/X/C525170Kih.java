package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoPickModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Kih, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525170Kih extends AbstractC2255721DQs<C05YE> implements C05YE, InterfaceC379610EuV {
    public static final C525180Kii LLILZLL = new Object() { // from class: X.0Kii
    };
    public static final int LLIZ = 8;
    public final C1DRG LL;
    public final ShortVideoContext LLILLJJLI;
    public final Function0<InterfaceC524480Kha> LLILLL;
    public final Function0<Set<String>> LLILZ;
    public final WeakReference<MvChoosePhotoScene> LLILZIL;

    public C05YE W1() {
        return this;
    }

    @Override // X.C05YE
    public Set<String> cd1() {
        return this.LLILZ.invoke();
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.C05YE
    public boolean G52(Object obj) {
        InterfaceC524480Kha interfaceC524480KhaInvoke = this.LLILLL.invoke();
        if (interfaceC524480KhaInvoke == null || !(obj instanceof MediaModel)) {
            return true;
        }
        return interfaceC524480KhaInvoke.LIZIZ((MediaModel) obj);
    }

    @Override // X.C05YE
    public void lp(List<? extends TikTokMediaModel> list) {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLILZIL.get();
        if (mvChoosePhotoScene == null) {
            C201955140j.LIZLLL(C539300LDc.LIZIZ, "AutoPick-AlbumDependency", "openAlbumForAutoPickAddMedia skipped: MvChoosePhotoScene no longer available");
            return;
        }
        C539300LDc c539300LDc = C539300LDc.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("openAlbumForAutoPickAddMedia preSelectedCount=");
        sbLIZ.append(list.size());
        C201955140j.LIZLLL(c539300LDc, "AutoPick-AlbumDependency", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC522380KeC interfaceC522380KeC = mvChoosePhotoScene.autoPickCoordinator;
        if (interfaceC522380KeC != null) {
            interfaceC522380KeC.lp(list);
        }
    }

    @Override // X.C05YE
    public void Jq1(List<? extends TikTokMediaModel> list, C19EG c19eg) {
        String str;
        ShortVideoContext shortVideoContext = this.LLILLJJLI;
        if (shortVideoContext != null) {
            str = shortVideoContext.enterFrom;
        } else {
            str = null;
        }
        C0L4U.LJIIJ(list, shortVideoContext, str, getDiContainer(), c19eg, false, null, false, null, 480);
    }

    @Override // X.C05YE
    public Object U20(List<? extends MediaModel> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLILZIL.get();
        if (mvChoosePhotoScene != null) {
            C539300LDc c539300LDc = C539300LDc.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Triggering regular album next step for ");
            sbLIZ.append(list.size());
            sbLIZ.append(" media items");
            C201955140j.LIZLLL(c539300LDc, "AutoPick-AlbumDependency", C2188811AlT.LIZIZ(sbLIZ));
            C1DFH c1dfh = C0PEM.LIZ;
            return C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C526370Kkd(mvChoosePhotoScene, list, null));
        }
        throw new IllegalStateException("MvChoosePhotoScene is no longer available");
    }

    @Override // X.C05YE
    public Object rA(List<? extends MediaModel> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        MvChoosePhotoScene mvChoosePhotoScene = this.LLILZIL.get();
        if (mvChoosePhotoScene != null) {
            C539300LDc c539300LDc = C539300LDc.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Triggering AutoPick loading flow for ");
            sbLIZ.append(list.size());
            sbLIZ.append(" media items");
            C201955140j.LIZLLL(c539300LDc, "AutoPick-AlbumDependency", C2188811AlT.LIZIZ(sbLIZ));
            C1DFH c1dfh = C0PEM.LIZ;
            return C23250099c.LJI(interfaceC1364105Vn, C2107308Nj.LIZ, new C526380Kke(mvChoosePhotoScene, list, null));
        }
        throw new IllegalStateException("MvChoosePhotoScene is no longer available");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C525170Kih(C1DRG c1drg, ShortVideoContext shortVideoContext, Function0<? extends InterfaceC524480Kha> function0, Function0<? extends Set<String>> function02, WeakReference<MvChoosePhotoScene> weakReference) {
        this.LL = c1drg;
        this.LLILLJJLI = shortVideoContext;
        this.LLILLL = function0;
        this.LLILZ = function02;
        this.LLILZIL = weakReference;
    }

    @Override // X.C05YE
    public void pq2(List<? extends TikTokMediaModel> list, String str, Boolean bool, Boolean bool2, String str2, String str3) {
        Context contextLIZIZ;
        String str4;
        String creationId;
        String str5;
        String str6;
        String creationId2;
        String strLJIJJLI;
        String musicId;
        CreativeModel creativeModel;
        AutoPickModel autoPickModel;
        MvChoosePhotoScene mvChoosePhotoScene = this.LLILZIL.get();
        if (mvChoosePhotoScene != null && (contextLIZIZ = C545820Lau.LIZIZ(mvChoosePhotoScene)) != null) {
            ShortVideoContext shortVideoContext = this.LLILLJJLI;
            String strLJIIJJI = null;
            if (shortVideoContext == null || (creativeModel = shortVideoContext.creativeModel) == null || (autoPickModel = creativeModel.autoPickModel) == null || (str4 = autoPickModel.pickId) == null) {
                str4 = "";
            }
            C539300LDc c539300LDc = C539300LDc.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[path=");
            sbLIZ.append(str);
            sbLIZ.append("][source=AutoPickAlbumDependencyImpl.mobClickAutoCut] media_count=");
            sbLIZ.append(list.size());
            sbLIZ.append(" creation_id=");
            ShortVideoContext shortVideoContext2 = this.LLILLJJLI;
            if (shortVideoContext2 != null) {
                creationId = shortVideoContext2.getCreationId();
            } else {
                creationId = null;
            }
            sbLIZ.append(creationId);
            sbLIZ.append(" shoot_way=");
            ShortVideoContext shortVideoContext3 = this.LLILLJJLI;
            if (shortVideoContext3 != null) {
                str5 = shortVideoContext3.shootWay;
            } else {
                str5 = null;
            }
            sbLIZ.append(str5);
            C201955140j.LIZLLL(c539300LDc, "click_autocut", C2188811AlT.LIZIZ(sbLIZ));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (TikTokMediaModel tikTokMediaModel : list) {
                AutoCutMediaModel.Companion.getClass();
                arrayList.add(C526710KlB.LIZ(contextLIZIZ, tikTokMediaModel));
            }
            ShortVideoContext shortVideoContext4 = this.LLILLJJLI;
            if (shortVideoContext4 != null) {
                str6 = shortVideoContext4.shootWay;
                creationId2 = shortVideoContext4.getCreationId();
            } else {
                str6 = null;
                creationId2 = null;
            }
            ShortVideoContext shortVideoContext5 = this.LLILLJJLI;
            if (shortVideoContext5 != null) {
                strLJIJJLI = shortVideoContext5.LJIJJLI();
            } else {
                strLJIJJLI = null;
            }
            ShortVideoContext shortVideoContext6 = this.LLILLJJLI;
            if (shortVideoContext6 != null) {
                musicId = shortVideoContext6.getMusicId();
            } else {
                musicId = null;
            }
            ShortVideoContext shortVideoContext7 = this.LLILLJJLI;
            if (shortVideoContext7 != null) {
                strLJIIJJI = shortVideoContext7.LJIIJJI();
            }
            C1417710mzp.LJIIZILJ(arrayList, str, str6, creationId2, false, strLJIJJLI, 0, musicId, strLJIIJJI, null, false, null, null, null, false, 0, false, null, 0, null, 0, false, false, false, false, null, new C525140Kie(str4, str, bool, bool2, str2, str3, list), 67107328);
        }
    }
}
