package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.creative.model.album.AlbumModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MediaListState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.restore.AlbumSelection;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.restore.abtest.AlbumSelectionRestoreConfig;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KmU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C527520KmU extends AbstractC2255721DQs<InterfaceC524880KiE> implements InterfaceC524880KiE, InterfaceC379610EuV {
    public static final C527560KmY LLJJIJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public static final Map<String, Boolean> LLJJJ;
    public final C1DRG LL;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public C09AE LLJILLL;
    public final C538770LBb<Boolean> LLJJI;
    public final C385670FAf<Boolean> LLJJIII;
    public final InterfaceC524880KiE LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), C524000Kgo.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), C527460KmO.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C530020KqW.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), ShortVideoContext.class, null);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 288));
    public final Set<String> LLJ = new LinkedHashSet();
    public final C01GW LLJJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 289));

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0KmY] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C527520KmU.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C527520KmU.class, "selectMaterialContext", "getSelectMaterialContext()Lcom/ss/android/ugc/aweme/shortvideo/album/SelectMaterialContext;", 0), new C2217381BqS(C527520KmU.class, "aiContentDataManager", "getAiContentDataManager()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/aiimagetab/AiContentDataManager;", 0), new C2217381BqS(C527520KmU.class, "mediaModelFactory", "getMediaModelFactory()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/choosemedia/model/TikTokMediaModelFactory;", 0), new C2217381BqS(C527520KmU.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};
        LLJJIJI = new Object() { // from class: X.0KmY
        };
        LLJJIJIL = 8;
        LLJJJ = new LinkedHashMap();
    }

    @Override // X.InterfaceC524880KiE
    public void clear() {
        this.LLJILJILJ = true;
        C527550KmX.LIZ(Z1());
    }

    public final AbstractC214814194y G2() {
        return (AbstractC214814194y) this.LLILLL.getValue(this, LLJJIJIIJIL[0]);
    }

    public final C524000Kgo H2() {
        return (C524000Kgo) this.LLILZ.getValue(this, LLJJIJIIJIL[1]);
    }

    public final ChooseMediaViewModel T2() {
        return (ChooseMediaViewModel) this.LLJJ.getValue();
    }

    public final C527460KmO W1() {
        return (C527460KmO) this.LLILZIL.getValue(this, LLJJIJIIJIL[2]);
    }

    public final String Z1() {
        return (String) this.LLIZLLLIL.getValue();
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.LLIZ.getValue(this, LLJJIJIIJIL[4]);
    }

    public final C530020KqW o2() {
        return (C530020KqW) this.LLILZLL.getValue(this, LLJJIJIIJIL[3]);
    }

    @Override // X.InterfaceC524880KiE
    public void bm2() {
        ArrayList<TikTokMediaModel> mediaList;
        MediaListState defaultSelectMediaList = ((ChooseMediaState) T2().hR2()).getDefaultSelectMediaList();
        if (defaultSelectMediaList == null || (mediaList = defaultSelectMediaList.getMediaList()) == null || !(!mediaList.isEmpty())) {
            return;
        }
        this.LLJJI.LJII(Boolean.TRUE);
        C527570KmZ c527570KmZ = C527570KmZ.LIZ;
        ShortVideoContext shortVideoContext = getShortVideoContext();
        int i = this.LLJI;
        int i2 = this.LLJIJIL;
        int i3 = this.LLJILJIL;
        c527570KmZ.getClass();
        C527570KmZ.LIZIZ(shortVideoContext, "show", i, i2, i3);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        this.LLJILLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C527540KmW(this, null), 3);
    }

    public InterfaceC524880KiE X1() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC524880KiE
    public C385670FAf<Boolean> fL2() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C527520KmU(C1DRG c1drg) {
        this.LL = c1drg;
        C538770LBb<Boolean> c538770LBb = new C538770LBb<>(Boolean.FALSE);
        this.LLJJI = c538770LBb;
        this.LLJJIII = c538770LBb;
    }

    public final boolean W2(Context context) {
        int iIntValue;
        String string = C527550KmX.LIZLLL().getString("last_used_uid", "");
        String currentUserID = C0CHQ.LIZ().getAccountService().getCurrentUserID();
        if (!Intrinsics.LJFF(string, currentUserID)) {
            if (string.length() > 0) {
                C527550KmX.LIZIZ();
                C527550KmX.LIZLLL().storeString("last_used_uid", currentUserID);
                return true;
            }
            C527550KmX.LIZLLL().storeString("last_used_uid", currentUserID);
        }
        long j = C527550KmX.LIZLLL().getLong(C527550KmX.LIZJ(Z1()), 0L);
        if (j == 0) {
            return true;
        }
        long jLJIIIIZZ = C19990313Jl.LJIIIIZZ(System.currentTimeMillis() - j, EnumC19990213Jk.MILLISECONDS);
        Integer num = ((AlbumSelectionRestoreConfig) C524670Kht.LIZIZ.getValue()).expiredMinutes;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 60;
        }
        if (C19990113Jj.LJI(jLJIIIIZZ, C19990313Jl.LJII(iIntValue, EnumC19990213Jk.MINUTES)) > 0) {
            C527550KmX.LIZ(Z1());
            return true;
        }
        Map<String, Boolean> map = LLJJJ;
        if (map.get(Z1()) != null) {
            return !r0.booleanValue();
        }
        map.put(Z1(), Boolean.TRUE);
        C0CHQ.LIZ().LJJJJZ();
        C804770Vhb c804770Vhb = C804770Vhb.LIZ;
        if (!Intrinsics.LJFF(C804770Vhb.LIZJ(context, true), "kill_app")) {
            return false;
        }
        C527550KmX.LIZIZ();
        return true;
    }

    @Override // X.InterfaceC524880KiE
    public void wP0(List<String> list) {
        int i;
        if (!list.isEmpty() && !this.LLJ.isEmpty()) {
            Iterator<String> it2 = list.iterator();
            int i2 = 0;
            int i3 = 0;
            while (it2.hasNext()) {
                if (this.LLJ.contains(it2.next())) {
                    i2++;
                } else {
                    i3++;
                }
            }
            AlbumModel albumModel = getShortVideoContext().creativeModel.albumModel;
            if (i2 == this.LLJ.size() && i3 == 0) {
                i = 1;
            } else if (i2 > 0) {
                i = 2;
            } else {
                i = 0;
            }
            albumModel.albumSelectionRestoreState = i;
            return;
        }
        getShortVideoContext().creativeModel.albumModel.albumSelectionRestoreState = null;
    }

    @Override // X.InterfaceC524880KiE
    public void Mt0(InterfaceC526830KlN interfaceC526830KlN, List<? extends TikTokMediaModel> list) {
        int iIntValue;
        C09AE c09ae = this.LLJILLL;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        this.LLJILLL = null;
        if (this.LLJILJILJ) {
            this.LLJJI.LJII(Boolean.FALSE);
            return;
        }
        boolean z = interfaceC526830KlN instanceof C526850KlP;
        if (z && ((C526850KlP) interfaceC526830KlN).LIZ) {
            C527570KmZ c527570KmZ = C527570KmZ.LIZ;
            ShortVideoContext shortVideoContext = getShortVideoContext();
            int i = this.LLJI;
            int i2 = this.LLJIJIL;
            int i3 = this.LLJILJIL;
            c527570KmZ.getClass();
            C527570KmZ.LIZIZ(shortVideoContext, "click", i, i2, i3);
        } else if (this.LLJJI.LIZJ().booleanValue()) {
            C527570KmZ c527570KmZ2 = C527570KmZ.LIZ;
            ShortVideoContext shortVideoContext2 = getShortVideoContext();
            int i4 = this.LLJI;
            int i5 = this.LLJIJIL;
            int i6 = this.LLJILJIL;
            c527570KmZ2.getClass();
            C527570KmZ.LIZIZ(shortVideoContext2, "dismiss", i4, i5, i6);
        }
        C538770LBb<Boolean> c538770LBb = this.LLJJI;
        Boolean bool = Boolean.FALSE;
        c538770LBb.LJII(bool);
        Integer num = ((AlbumSelectionRestoreConfig) C524670Kht.LIZIZ.getValue()).minSelectionCount;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 3;
        }
        if (list.size() >= iIntValue && !z) {
            LLJJJ.put(Z1(), Boolean.TRUE);
            String strZ1 = Z1();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (TikTokMediaModel tikTokMediaModel : list) {
                arrayList.add(new AlbumSelection(((MediaModel) tikTokMediaModel).id, Integer.valueOf(tikTokMediaModel.type), Integer.valueOf(tikTokMediaModel.loadSource.getKey())));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                C1227904rF.LIZ.getClass();
                String strLJI = C1227904rF.LJI(obj);
                if (strLJI != null) {
                    arrayList2.add(strLJI);
                }
            }
            C527550KmX.LIZLLL().storeStringArray(strZ1, (String[]) arrayList2.toArray(new String[0]));
            C527550KmX.LIZLLL().storeLong(C527550KmX.LIZJ(strZ1), System.currentTimeMillis());
            return;
        }
        LLJJJ.put(Z1(), bool);
        C527550KmX.LIZ(Z1());
    }

    public final boolean w2(Map<String, Integer> map, String str) {
        if (map.containsKey(str)) {
            Integer num = map.get(str);
            if (num == null || num.intValue() != 1) {
                return false;
            }
            return true;
        }
        boolean zIsLivePhotoForJPEGFile = VEUtils.isLivePhotoForJPEGFile(str, null, false);
        C0MZO.LIZIZ(zIsLivePhotoForJPEGFile ? 1 : 0, str);
        return zIsLivePhotoForJPEGFile;
    }
}
