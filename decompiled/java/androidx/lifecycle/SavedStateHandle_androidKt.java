package androidx.lifecycle;

import X.C2188811AlT;

/* JADX INFO: loaded from: classes3.dex */
public final class SavedStateHandle_androidKt {
    public static final String createMutuallyExclusiveErrorMessage(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key '");
        sbLIZ.append(str);
        sbLIZ.append("', but not both.");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
