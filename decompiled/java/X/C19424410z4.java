package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviAnimatedGifDataModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviDataModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviFeatureDataModel;
import com.ss.android.ugc.aweme.model.api.data.ProfileNaviStaticImageDataModel;
import com.ss.android.ugc.aweme.user.UserStore;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.10z4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19424410z4 {
    public static final /* synthetic */ int LJI = 0;
    public String LIZ;
    public String LIZIZ = "#A5E6FF";
    public final HashMap<String, InterfaceC19426310zN> LIZJ = new HashMap<>();
    public final HashMap<String, C19425110zB> LIZLLL = new HashMap<>();
    public UrlModel LJ;
    public UrlModel LJFF;

    public final ProfileNaviDataModel LIZJ() {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str = this.LIZ;
        UserStore.LIZ.getClass();
        String strLIZLLL = UserStore.LIZLLL();
        String str2 = this.LIZIZ;
        UrlModel urlModel = this.LJFF;
        if (urlModel != null) {
            arrayList = new ArrayList();
            arrayList.add(new ProfileNaviAnimatedGifDataModel("anim_1", urlModel));
        } else {
            arrayList = null;
        }
        ArrayList arrayList3 = new ArrayList();
        for (InterfaceC19426310zN interfaceC19426310zN : this.LIZJ.values()) {
            arrayList3.add(new ProfileNaviFeatureDataModel(interfaceC19426310zN.getCategory().getKey(), C19424810z8.LIZIZ(interfaceC19426310zN)));
        }
        for (C19425110zB c19425110zB : this.LIZLLL.values()) {
            arrayList3.add(new ProfileNaviFeatureDataModel(c19425110zB.LIZJ.getKey(), C19424810z8.LIZIZ(c19425110zB)));
        }
        if (this.LJ != null) {
            arrayList2 = new ArrayList();
            arrayList2.add(new ProfileNaviStaticImageDataModel("webp", null, this.LJ));
        } else {
            arrayList2 = null;
        }
        return new ProfileNaviDataModel(str, strLIZLLL, str2, arrayList, arrayList3, arrayList2, 0, 64, null);
    }

    public final InterfaceC19426310zN LIZ(String str) {
        if (this.LIZJ.containsKey(str)) {
            return this.LIZJ.get(str);
        }
        return null;
    }

    public final C19425110zB LIZIZ(String str) {
        if (this.LIZLLL.containsKey(str)) {
            return this.LIZLLL.get(str);
        }
        return null;
    }
}
