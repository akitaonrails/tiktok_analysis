package X;

import com.ss.android.ugc.aweme.feed.model.PhotoModeETData;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0SNK, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SNK extends C09AY implements Function0<C720290SNf> {
    public C0SNK() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0SNf] */
    @Override // kotlin.jvm.functions.Function0
    public final C720290SNf invoke() {
        return new C0SAE() { // from class: X.0SNf
            public final Map<String, PhotoModeETData> LIZ = new LinkedHashMap();

            @Override // X.C0SAE
            public final void LIZ(String str) {
                if (str != null && str.length() != 0 && this.LIZ.containsKey(str)) {
                    this.LIZ.remove(str);
                }
            }

            @Override // X.C0SAE
            public final int LIZJ(String str) {
                PhotoModeETData photoModeETData = (PhotoModeETData) ((LinkedHashMap) this.LIZ).get(str);
                if (photoModeETData != null) {
                    return photoModeETData.currentPhotoIndex;
                }
                return -1;
            }

            @Override // X.C0SAE
            public final void LIZIZ(int i, String str) {
                PhotoModeETData photoModeETData;
                if (str != null && str.length() != 0) {
                    if (this.LIZ.containsKey(str) && (photoModeETData = (PhotoModeETData) ((LinkedHashMap) this.LIZ).get(str)) != null) {
                        this.LIZ.put(str, photoModeETData.copy(i));
                    } else {
                        this.LIZ.put(str, new PhotoModeETData(i));
                    }
                }
            }
        };
    }
}
