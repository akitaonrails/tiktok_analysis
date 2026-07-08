package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.CardStruct;

/* JADX INFO: renamed from: X.0jJm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276320jJm {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final EnumC1493270oxh LJ;

    public C1276320jJm(String str, EnumC1493270oxh enumC1493270oxh) {
        this.LIZ = str;
        this.LIZIZ = str;
        this.LIZJ = CardStruct.IStatusCode.DEFAULT;
        this.LIZLLL = CardStruct.IStatusCode.DEFAULT;
        this.LJ = enumC1493270oxh;
    }

    public C1276320jJm(String str, String str2, String str3, String str4, EnumC1493270oxh enumC1493270oxh, String str5) {
        this.LIZ = str;
        this.LIZIZ = str2;
        if (!TextUtils.isEmpty(str3)) {
            this.LIZJ = str3;
        } else {
            this.LIZJ = CardStruct.IStatusCode.DEFAULT;
        }
        if (!TextUtils.isEmpty(str4)) {
            this.LIZLLL = str4;
        } else {
            this.LIZLLL = CardStruct.IStatusCode.DEFAULT;
        }
        TextUtils.isEmpty(str5);
        this.LJ = enumC1493270oxh;
    }
}
