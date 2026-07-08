package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;

/* JADX INFO: renamed from: X.0psc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528560psc extends C199536135i {

    @InterfaceC199548135u("Accept")
    public List<String> accept;

    @InterfaceC199548135u("Accept-Encoding")
    public List<String> acceptEncoding;

    @InterfaceC199548135u("Age")
    public List<Long> age;

    @InterfaceC199548135u("WWW-Authenticate")
    public List<String> authenticate;

    @InterfaceC199548135u("Authorization")
    public List<String> authorization;

    @InterfaceC199548135u("Cache-Control")
    public List<String> cacheControl;

    @InterfaceC199548135u("Content-Encoding")
    public List<String> contentEncoding;

    @InterfaceC199548135u("Content-Length")
    public List<Long> contentLength;

    @InterfaceC199548135u("Content-MD5")
    public List<String> contentMD5;

    @InterfaceC199548135u("Content-Range")
    public List<String> contentRange;

    @InterfaceC199548135u("Content-Type")
    public List<String> contentType;

    @InterfaceC199548135u("Cookie")
    public List<String> cookie;

    @InterfaceC199548135u("Date")
    public List<String> date;

    @InterfaceC199548135u("ETag")
    public List<String> etag;

    @InterfaceC199548135u("Expires")
    public List<String> expires;

    @InterfaceC199548135u("If-Match")
    public List<String> ifMatch;

    @InterfaceC199548135u("If-Modified-Since")
    public List<String> ifModifiedSince;

    @InterfaceC199548135u("If-None-Match")
    public List<String> ifNoneMatch;

    @InterfaceC199548135u("If-Range")
    public List<String> ifRange;

    @InterfaceC199548135u("If-Unmodified-Since")
    public List<String> ifUnmodifiedSince;

    @InterfaceC199548135u("Last-Modified")
    public List<String> lastModified;

    @InterfaceC199548135u("Location")
    public List<String> location;

    @InterfaceC199548135u("MIME-Version")
    public List<String> mimeVersion;

    @InterfaceC199548135u("Range")
    public List<String> range;

    @InterfaceC199548135u("Retry-After")
    public List<String> retryAfter;

    @InterfaceC199548135u("User-Agent")
    public List<String> userAgent;

    @InterfaceC199548135u("Warning")
    public List<String> warning;

    public C1528560psc() {
        super(EnumSet.of(EnumC1528570psd.IGNORE_CASE));
        this.acceptEncoding = new ArrayList(Collections.singleton("gzip"));
    }

    public final String LIZJ() {
        List<String> list = this.userAgent;
        return (String) (list == null ? null : ListProtector.get(list, 0));
    }

    @Override // X.C199536135i
    /* JADX INFO: renamed from: LIZ */
    public final C199536135i clone() {
        return super.clone();
    }

    @Override // X.C199536135i, java.util.AbstractMap
    public final Object clone() {
        return super.clone();
    }

    public final void LJ(String str) {
        ArrayList arrayList;
        if (str == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            arrayList.add(str);
        }
        this.userAgent = arrayList;
    }

    @Override // X.C199536135i
    public final void LIZIZ(Object obj, String str) {
        super.LIZIZ(obj, str);
    }

    public final void LIZLLL(Object obj, String str) {
        super.LIZIZ(obj, str);
    }
}
