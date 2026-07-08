package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gsr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class EnumC1182750gsr {
    public static final EnumC1182750gsr LIST_COMPLETE;
    public static final EnumC1182750gsr LIST_LOADING;
    public static final /* synthetic */ EnumC1182750gsr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public EnumC1182750gsr() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1182750gsr> getEntries() {
        return LLILLJJLI;
    }

    public void closePoiQuizCard(C1182710gsn c1182710gsn, boolean z) {
    }

    public void onClickBottomBtn(C1182710gsn c1182710gsn) {
    }

    public void onClickMapIconBtn(C1182710gsn c1182710gsn) {
    }

    public void onError(C1182710gsn c1182710gsn) {
    }

    public void onMarkerHighlight(C1182710gsn c1182710gsn, String str) {
    }

    public void onPoiListDataLoaded(C1182710gsn c1182710gsn, String str) {
    }

    public void onPoiListDataStart(C1182710gsn c1182710gsn) {
    }

    public void onRetry(C1182710gsn c1182710gsn) {
    }

    static {
        EnumC1182750gsr enumC1182750gsr = new EnumC1182750gsr() { // from class: X.0gsq
            @Override // X.EnumC1182750gsr
            public final void onPoiListDataLoaded(C1182710gsn c1182710gsn, String str) {
                c1182710gsn.LIZ(EnumC1182750gsr.LIST_COMPLETE, str);
            }
        };
        LIST_LOADING = enumC1182750gsr;
        EnumC1182750gsr enumC1182750gsr2 = new EnumC1182750gsr() { // from class: X.0gss
            @Override // X.EnumC1182750gsr
            public final void onPoiListDataStart(C1182710gsn c1182710gsn) {
                c1182710gsn.LIZ(EnumC1182750gsr.LIST_LOADING, null);
            }
        };
        LIST_COMPLETE = enumC1182750gsr2;
        EnumC1182750gsr[] enumC1182750gsrArr = {enumC1182750gsr, enumC1182750gsr2};
        LL = enumC1182750gsrArr;
        LLILLJJLI = new C2254308sP(enumC1182750gsrArr);
    }

    public static EnumC1182750gsr[] values() {
        return (EnumC1182750gsr[]) LL.clone();
    }

    public static EnumC1182750gsr valueOf(String str) {
        return (EnumC1182750gsr) C08FF.LIZ(EnumC1182750gsr.class, str);
    }

    public EnumC1182750gsr(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
    }
}
