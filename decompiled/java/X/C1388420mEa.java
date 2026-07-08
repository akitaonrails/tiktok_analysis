package X;

import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.tako.share.panel.TakoImageSharePackage;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0mEa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388420mEa {
    public static final Map<BaseSharePackage, C1388380mEW> LIZ = new LinkedHashMap();
    public static volatile int LIZIZ;

    public static C1388380mEW LIZ(TakoImageSharePackage takoImageSharePackage) {
        return (C1388380mEW) ((LinkedHashMap) LIZ).get(takoImageSharePackage);
    }
}
