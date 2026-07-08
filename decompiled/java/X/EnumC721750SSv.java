package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SSv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class EnumC721750SSv {
    public static final EnumC721750SSv LIVE;
    public static final /* synthetic */ EnumC721750SSv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC721750SSv LOOP;
    public static final EnumC721750SSv ONCE;
    public final boolean LL;

    public EnumC721750SSv() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC721750SSv> getEntries() {
        return LLILLL;
    }

    public abstract boolean isLoop();

    static {
        EnumC721750SSv enumC721750SSv = new EnumC721750SSv() { // from class: X.0ST2
            @Override // X.EnumC721750SSv
            public final boolean isLoop() {
                return false;
            }
        };
        ONCE = enumC721750SSv;
        EnumC721750SSv enumC721750SSv2 = new EnumC721750SSv() { // from class: X.0ST0
            public final boolean LLILZ = true;

            @Override // X.EnumC721750SSv
            public final boolean isLoop() {
                return this.LLILZ;
            }
        };
        LIVE = enumC721750SSv2;
        EnumC721750SSv enumC721750SSv3 = new EnumC721750SSv() { // from class: X.0ST1
            public final boolean LLILZ = true;

            @Override // X.EnumC721750SSv
            public final boolean getShowLiveTagInDetail() {
                return false;
            }

            @Override // X.EnumC721750SSv
            public final boolean isLoop() {
                return this.LLILZ;
            }
        };
        LOOP = enumC721750SSv3;
        EnumC721750SSv[] enumC721750SSvArr = {enumC721750SSv, enumC721750SSv2, enumC721750SSv3};
        LLILLJJLI = enumC721750SSvArr;
        LLILLL = new C2254308sP(enumC721750SSvArr);
    }

    public static EnumC721750SSv[] values() {
        return (EnumC721750SSv[]) LLILLJJLI.clone();
    }

    public boolean getShowLiveTagInDetail() {
        return this.LL;
    }

    public static EnumC721750SSv valueOf(String str) {
        return (EnumC721750SSv) C08FF.LIZ(EnumC721750SSv.class, str);
    }

    public EnumC721750SSv(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this.LL = true;
    }
}
