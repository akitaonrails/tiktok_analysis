package X;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: X.0jVv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1283850jVv {
    public final Map<String, String> LIZ;
    public String LIZIZ;
    public int[] LIZJ;
    public int LIZLLL;

    public C1283850jVv() {
        throw null;
    }

    public final String toString() {
        return "{ modelNamePrefix: " + this.LIZIZ + ", groupIds: " + Arrays.toString(this.LIZJ) + ", downsample: " + this.LIZLLL + ", host: " + this.LIZ.get("host") + ", accessKey: " + this.LIZ.get("accessKey") + ", deviceId: " + this.LIZ.get("deviceId") + ", appVersion: " + this.LIZ.get("appVersion") + ", appID: " + this.LIZ.get("appID") + ", platformSdkVersion: " + this.LIZ.get("platformSdkVersion") + " }";
    }

    public C1283850jVv(Map map) {
        this.LIZIZ = "";
        this.LIZLLL = 1;
        this.LIZ = map;
    }
}
