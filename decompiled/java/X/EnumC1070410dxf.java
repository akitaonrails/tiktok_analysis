package X;

import com.ss.android.ugc.aweme.relation.service.SocialMonoFreqControlService;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0dxf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class EnumC1070410dxf implements Serializable {
    public static final EnumC1070410dxf CONTACT;
    public static final EnumC1070410dxf FACEBOOK;
    public static final /* synthetic */ EnumC1070410dxf[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final int LL;
    public final String LLILLJJLI;

    public EnumC1070410dxf() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1070410dxf> getEntries() {
        return LLILZ;
    }

    public abstract boolean isGrant();

    static {
        EnumC1070410dxf enumC1070410dxf = new EnumC1070410dxf() { // from class: X.0dxg
            @Override // X.EnumC1070410dxf
            public final boolean isGrant() {
                return C1071540dzU.LIZIZ.LIZLLL(this).LIZ().LIZLLL;
            }
        };
        CONTACT = enumC1070410dxf;
        EnumC1070410dxf enumC1070410dxf2 = new EnumC1070410dxf() { // from class: X.0dxe
            @Override // X.EnumC1070410dxf
            public final boolean isGrant() {
                if (SocialMonoFreqControlService.LIZIZ().LIZ(C1E7L.AUTH_FB)) {
                    return C1071540dzU.LIZIZ.LIZLLL(this).LIZ().LIZLLL;
                }
                return true;
            }
        };
        FACEBOOK = enumC1070410dxf2;
        EnumC1070410dxf[] enumC1070410dxfArr = {enumC1070410dxf, enumC1070410dxf2};
        LLILLL = enumC1070410dxfArr;
        LLILZ = new C2254308sP(enumC1070410dxfArr);
    }

    public static EnumC1070410dxf[] values() {
        return (EnumC1070410dxf[]) LLILLL.clone();
    }

    public final String getString() {
        return this.LLILLJJLI;
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1070410dxf valueOf(String str) {
        return (EnumC1070410dxf) C08FF.LIZ(EnumC1070410dxf.class, str);
    }

    public EnumC1070410dxf(String str, int i, int i2, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
