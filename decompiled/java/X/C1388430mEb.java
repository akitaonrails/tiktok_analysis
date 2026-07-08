package X;

import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.tako.share.panel.TakoVideoSharePackage;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0mEb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388430mEb {
    public static final Map<BaseSharePackage, C1388410mEZ> LIZ = new LinkedHashMap();

    public static C1388410mEZ LIZ(TakoVideoSharePackage takoVideoSharePackage) {
        return (C1388410mEZ) ((LinkedHashMap) LIZ).get(takoVideoSharePackage);
    }
}
