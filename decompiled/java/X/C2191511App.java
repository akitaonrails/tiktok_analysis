package X;

import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.1App, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191511App extends HashMap<String, Object> {
    public static final C2191601Apy Companion = new Object() { // from class: X.1Apy
    };
    public final String LL;
    public final long LLILLJJLI;
    public final boolean LLILLL;
    public final long LLILZ;
    public final long LLILZIL;
    public final long LLILZLL;
    public final long LLIZ;
    public final long LLIZLLLIL;
    public final long LLJ;
    public long LLJI;
    public long LLJIJIL;
    public final long LLJILJIL = System.currentTimeMillis();

    public final synchronized void toMap() {
        if (containsKey("url")) {
            return;
        }
        put("url", this.LL);
        put("is_hit_cdn", Boolean.valueOf(this.LLILLL));
        put("download_duration", Long.valueOf(this.LLILZ));
        put("file_size", Long.valueOf(this.LLILLJJLI));
        put("dns_time", Long.valueOf(this.LLILZLL));
        put("ssl_time", Long.valueOf(this.LLILZIL));
        put("timing_timing_connect", Long.valueOf(this.LLIZ));
        put("speed", Long.valueOf(this.LLJI));
        put("duration", Long.valueOf(this.LLJIJIL));
    }

    public final String getHost() {
        String host = UriProtector.parse(this.LL).getHost();
        return host == null ? "" : host;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return "SpeedData(speed=" + this.LLJI + ", duration=" + this.LLJIJIL + ", contentLength=" + this.LLILLJJLI + ", hitCdnCache=" + this.LLILLL + ", totalTime=" + this.LLILZ + ", sslTime=" + this.LLILZIL + ", dnsTime=" + this.LLILZLL + ", connectTime=" + this.LLIZ + ", sendTime=" + this.LLIZLLLIL + ", receiveTime=" + this.LLJ + ", timeStamp=" + this.LLJILJIL + ')';
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Object>> entrySet() {
        return getEntries();
    }

    public /* bridge */ Set<Map.Entry<String, Object>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    public final long getConnectTime() {
        return this.LLIZ;
    }

    public final long getContentLength() {
        return this.LLILLJJLI;
    }

    public final long getDnsTime() {
        return this.LLILZLL;
    }

    public final long getDuration() {
        return this.LLJIJIL;
    }

    public final boolean getHitCdnCache() {
        return this.LLILLL;
    }

    public final long getReceiveTime() {
        return this.LLJ;
    }

    public final long getSendTime() {
        return this.LLIZLLLIL;
    }

    public final long getSpeed() {
        return this.LLJI;
    }

    public final long getSslTime() {
        return this.LLILZIL;
    }

    public final long getTimeStamp() {
        return this.LLJILJIL;
    }

    public final long getTotalTime() {
        return this.LLILZ;
    }

    public final String getUrl() {
        return this.LL;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsKey((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return get((String) obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        return remove((String) obj);
    }

    public final void setDuration(long j) {
        this.LLJIJIL = j;
    }

    public final void setSpeed(long j) {
        this.LLJI = j;
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ Object get(String str) {
        return super.get((Object) str);
    }

    public /* bridge */ Object remove(String str) {
        return super.remove((Object) str);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof String)) {
            return obj2;
        }
        return getOrDefault((String) obj, obj2);
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (!(obj instanceof String) || obj2 == null) {
            return false;
        }
        return remove((String) obj, obj2);
    }

    public /* bridge */ Object getOrDefault(String str, Object obj) {
        return super.getOrDefault((Object) str, obj);
    }

    public /* bridge */ boolean remove(String str, Object obj) {
        return super.remove((Object) str, obj);
    }

    public C2191511App(String str, long j, boolean z, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = z;
        this.LLILZ = j2;
        this.LLILZIL = j3;
        this.LLILZLL = j4;
        this.LLIZ = j5;
        this.LLIZLLLIL = j6;
        this.LLJ = j7;
    }
}
