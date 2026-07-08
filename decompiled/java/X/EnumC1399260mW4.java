package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IAILiveService;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mW4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class EnumC1399260mW4 implements InterfaceC1770706wb {
    public static final EnumC1399260mW4 AI_LIVE;
    public static final EnumC1399260mW4 AVATAR;
    public static final /* synthetic */ EnumC1399260mW4[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1399260mW4 REMIX;
    public static final EnumC1399260mW4 TRY_IT_OUT;

    public EnumC1399260mW4() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1399260mW4> getEntries() {
        return LLILLJJLI;
    }

    public abstract /* synthetic */ String getButtonText();

    public abstract /* synthetic */ Integer getEndIcon();

    public abstract /* synthetic */ Integer getIconTint();

    public abstract /* synthetic */ Integer getStartIcon();

    public abstract /* synthetic */ String getStartIconUrl();

    static {
        EnumC1399260mW4 enumC1399260mW4 = new EnumC1399260mW4() { // from class: X.0mW2
            public final String LLILLL = IAILiveService.DefaultImpls.getDynamicString$default(((IExternalService) ServiceManager.get().getService(IExternalService.class)).getAILiveService(), 2131820734, null, new Object[0], 2, null);
            public final int LLILZ = R.attr.ny;
            public final int LLILZIL = R.raw.icon_color_ame_effect;

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final Integer getEndIcon() {
                return null;
            }

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final String getStartIconUrl() {
                return null;
            }

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final Integer getIconTint() {
                return Integer.valueOf(this.LLILZ);
            }

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final Integer getStartIcon() {
                return Integer.valueOf(this.LLILZIL);
            }

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final String getButtonText() {
                return this.LLILLL;
            }
        };
        AI_LIVE = enumC1399260mW4;
        EnumC1399260mW4 enumC1399260mW42 = new EnumC1399260mW4() { // from class: X.0mW7
            public final String LLILLL = C1383370m6R.LJIIJ(2131835099);
            public final int LLILZ = R.attr.ny;
            public final int LLILZIL = R.raw.icon_color_ame_effect;

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final Integer getEndIcon() {
                return null;
            }

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final String getStartIconUrl() {
                return null;
            }

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final Integer getIconTint() {
                return Integer.valueOf(this.LLILZ);
            }

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final Integer getStartIcon() {
                return Integer.valueOf(this.LLILZIL);
            }

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final String getButtonText() {
                return this.LLILLL;
            }
        };
        TRY_IT_OUT = enumC1399260mW42;
        EnumC1399260mW4 enumC1399260mW43 = new EnumC1399260mW4() { // from class: X.0mW3
            public final String LLILLL = C1383370m6R.LJIIJ(2131850177);
            public final int LLILZ = R.attr.zi;
            public final int LLILZIL = R.raw.icon_ai_generate;

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final Integer getEndIcon() {
                return null;
            }

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final String getStartIconUrl() {
                return null;
            }

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final Integer getIconTint() {
                return Integer.valueOf(this.LLILZ);
            }

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final Integer getStartIcon() {
                return Integer.valueOf(this.LLILZIL);
            }

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final String getButtonText() {
                return this.LLILLL;
            }
        };
        AVATAR = enumC1399260mW43;
        EnumC1399260mW4 enumC1399260mW44 = new EnumC1399260mW4() { // from class: X.0mW6
            public final String LLILLL = C1383370m6R.LJIIJ(2131825042);
            public final int LLILZ = R.attr.zi;
            public final int LLILZIL = R.raw.icon_ai_generate;

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final Integer getEndIcon() {
                return null;
            }

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final String getStartIconUrl() {
                return null;
            }

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final Integer getIconTint() {
                return Integer.valueOf(this.LLILZ);
            }

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final Integer getStartIcon() {
                return Integer.valueOf(this.LLILZIL);
            }

            @Override // X.EnumC1399260mW4, X.InterfaceC1770706wb
            public final String getButtonText() {
                return this.LLILLL;
            }
        };
        REMIX = enumC1399260mW44;
        EnumC1399260mW4[] enumC1399260mW4Arr = {enumC1399260mW4, enumC1399260mW42, enumC1399260mW43, enumC1399260mW44};
        LL = enumC1399260mW4Arr;
        LLILLJJLI = new C2254308sP(enumC1399260mW4Arr);
    }

    public static EnumC1399260mW4[] values() {
        return (EnumC1399260mW4[]) LL.clone();
    }

    public static EnumC1399260mW4 valueOf(String str) {
        return (EnumC1399260mW4) C08FF.LIZ(EnumC1399260mW4.class, str);
    }

    public EnumC1399260mW4(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
