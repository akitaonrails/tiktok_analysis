package X;

import com.zhiliaoapp.musically.R;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class EnumC2180541AVo {
    public static final /* synthetic */ EnumC2180541AVo[] LLILZ;
    public static final /* synthetic */ C2254308sP LLILZIL;
    public static final EnumC2180541AVo UNKNOW;
    public static final EnumC2180541AVo V_ALL;
    public static final EnumC2180541AVo V_ALPHA;
    public static final EnumC2180541AVo V_ANIMATE;
    public static final EnumC2180541AVo V_VISIBLITY;
    public final String LL;
    public final String LLILLJJLI;
    public final int LLILLL;

    public static InterfaceC2044707zh<EnumC2180541AVo> getEntries() {
        return LLILZIL;
    }

    static {
        EnumC20441014ye enumC20441014ye = EnumC20441014ye.V;
        EnumC2180541AVo enumC2180541AVo = new EnumC2180541AVo("V_ALL", 0, enumC20441014ye.getValue(), "ALL", R.id.emd);
        V_ALL = enumC2180541AVo;
        EnumC2180541AVo enumC2180541AVo2 = new EnumC2180541AVo("V_VISIBLITY", 1, enumC20441014ye.getValue(), "VISIBILITY", R.id.emg);
        V_VISIBLITY = enumC2180541AVo2;
        EnumC2180541AVo enumC2180541AVo3 = new EnumC2180541AVo("V_ALPHA", 2, enumC20441014ye.getValue(), "ALPHA", R.id.eme);
        V_ALPHA = enumC2180541AVo3;
        EnumC2180541AVo enumC2180541AVo4 = new EnumC2180541AVo("V_ANIMATE", 3, enumC20441014ye.getValue(), "ANIMATE", R.id.emf);
        V_ANIMATE = enumC2180541AVo4;
        EnumC2180541AVo enumC2180541AVo5 = new EnumC2180541AVo("UNKNOW", 4, EnumC20441014ye.N.getValue(), "UNKNOW", -1);
        UNKNOW = enumC2180541AVo5;
        EnumC2180541AVo[] enumC2180541AVoArr = {enumC2180541AVo, enumC2180541AVo2, enumC2180541AVo3, enumC2180541AVo4, enumC2180541AVo5};
        LLILZ = enumC2180541AVoArr;
        LLILZIL = new C2254308sP(enumC2180541AVoArr);
    }

    public static EnumC2180541AVo[] values() {
        return (EnumC2180541AVo[]) LLILZ.clone();
    }

    public final String getId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append('_');
        sbLIZ.append(this.LLILLJJLI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final String getGroup() {
        return this.LL;
    }

    public final int getTagKey() {
        return this.LLILLL;
    }

    public final String getType() {
        return this.LLILLJJLI;
    }

    public static EnumC2180541AVo valueOf(String str) {
        return (EnumC2180541AVo) C08FF.LIZ(EnumC2180541AVo.class, str);
    }

    public EnumC2180541AVo(String str, int i, String str2, String str3, int i2) {
        this.LL = str2;
        this.LLILLJJLI = str3;
        this.LLILLL = i2;
    }
}
