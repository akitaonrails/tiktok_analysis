package X;

import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0dDF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public enum EnumC1041630dDF {
    refresh(R.id.t22, "refresh"),
    copylink(R.id.ey6, "copylink"),
    openwithbrowser(R.id.poh, "openwithbrowser");

    public int id;
    public String key;

    public static EnumC1041630dDF valueOf(String str) {
        return (EnumC1041630dDF) C08FF.LIZ(EnumC1041630dDF.class, str);
    }

    EnumC1041630dDF(int i, String str) {
        this.id = i;
        this.key = str;
    }
}
