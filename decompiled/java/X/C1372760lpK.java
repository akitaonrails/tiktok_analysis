package X;

import com.ss.android.ugc.aweme.specact.model.NowShareModel$TextItem;

/* JADX INFO: renamed from: X.0lpK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1372760lpK {
    public static final C1372850lpT LIZ(NowShareModel$TextItem nowShareModel$TextItem) {
        String str = nowShareModel$TextItem.text;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = nowShareModel$TextItem.starlingKey;
        if (str3 != null) {
            str2 = str3;
        }
        return new C1372850lpT(str, str2);
    }
}
