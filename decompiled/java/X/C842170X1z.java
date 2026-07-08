package X;

import android.os.Build;
import com.bytedance.helios.network.NetworkComponent;
import com.bytedance.helios.network.api.config.NetworkConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.0X1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842170X1z extends HttpURLConnection implements InterfaceC841570Wzr {
    public static final /* synthetic */ int LJIIL = 0;
    public final HttpURLConnection LIZ;
    public final String LIZIZ;
    public final C0WZW LIZJ;
    public int LIZLLL;
    public String LJ;
    public boolean LJFF;
    public final C0X0B LJI;
    public C840660WyO LJII;
    public volatile InputStream LJIIIIZZ;
    public C840760WyY LJIIIZ;
    public long LJIIJ;
    public final HashMap<String, String> LJIIJJI;

    @Override // java.net.URLConnection
    public final void connect() throws IOException {
        if (!this.LJFF) {
            this.LJFF = true;
            C841250WzL.LIZIZ(this, this.LIZIZ);
        }
        if (this.LIZLLL == -1) {
            this.LIZ.connect();
        }
    }

    @Override // java.net.HttpURLConnection
    public final void disconnect() {
        this.LIZ.disconnect();
    }

    @Override // java.net.URLConnection
    public final boolean getAllowUserInteraction() {
        return this.LIZ.getAllowUserInteraction();
    }

    @Override // java.net.URLConnection
    public final int getConnectTimeout() {
        return this.LIZ.getConnectTimeout();
    }

    @Override // java.net.URLConnection
    public final boolean getDefaultUseCaches() {
        return this.LIZ.getDefaultUseCaches();
    }

    @Override // java.net.URLConnection
    public final boolean getDoInput() {
        return this.LIZ.getDoInput();
    }

    @Override // java.net.URLConnection
    public final boolean getDoOutput() {
        return this.LIZ.getDoOutput();
    }

    @Override // java.net.HttpURLConnection
    public final InputStream getErrorStream() {
        if (!this.LJFF) {
            this.LJFF = true;
            C841250WzL.LIZIZ(this, this.LIZIZ);
        }
        return this.LIZLLL != -1 ? new ByteArrayInputStream(this.LJ.getBytes(Charsets.UTF_8)) : this.LIZ.getErrorStream();
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getHeaderFields() {
        if (!this.LJFF) {
            this.LJFF = true;
            C841250WzL.LIZIZ(this, this.LIZIZ);
        }
        return this.LIZLLL != -1 ? new HashMap() : this.LIZ.getHeaderFields();
    }

    @Override // java.net.URLConnection
    public final long getIfModifiedSince() {
        return this.LIZ.getIfModifiedSince();
    }

    @Override // java.net.URLConnection
    public final InputStream getInputStream() {
        InputStream inputStream;
        boolean z = true;
        if (!this.LJFF) {
            this.LJFF = true;
            C841250WzL.LIZIZ(this, this.LIZIZ);
        }
        if (this.LIZLLL != -1) {
            return new ByteArrayInputStream(this.LJ.getBytes(Charsets.UTF_8));
        }
        NetworkComponent networkComponent = NetworkComponent.INSTANCE;
        NetworkConfig networkConfigNetworkConfigOrNull = networkComponent.networkConfigOrNull();
        if (!(networkConfigNetworkConfigOrNull != null && networkConfigNetworkConfigOrNull.parseBody) && !networkComponent.isOfflineEnv()) {
            z = false;
        }
        if (!z) {
            C841250WzL.LIZ(this, null, this.LJII, this.LIZIZ);
            return this.LIZ.getInputStream();
        }
        if (this.LJIIIIZZ == null) {
            synchronized (this) {
                try {
                    if (this.LJIIIIZZ == null) {
                        InputStream inputStream2 = this.LIZ.getInputStream();
                        if (inputStream2 == null) {
                            C841250WzL.LIZ(this, null, this.LJII, this.LIZIZ);
                            return null;
                        }
                        if (C0X0N.LIZ(getHeaderField("Content-Type"))) {
                            inputStream = new C0X21(inputStream2, new C0X24() { // from class: X.0X22
                                @Override // X.C0X24
                                public final void LIZ(byte[] bArr) {
                                    C842170X1z c842170X1z = this.LIZ;
                                    C841250WzL.LIZ(c842170X1z, bArr, c842170X1z.LJII, c842170X1z.LIZIZ);
                                }
                            });
                        } else {
                            C841250WzL.LIZ(this, null, this.LJII, this.LIZIZ);
                            inputStream = this.LIZ.getInputStream();
                        }
                        this.LJIIIIZZ = inputStream;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return this.LJIIIIZZ;
    }

    @Override // java.net.HttpURLConnection
    public final boolean getInstanceFollowRedirects() {
        return this.LIZ.getInstanceFollowRedirects();
    }

    @Override // java.net.URLConnection
    public final OutputStream getOutputStream() {
        if (!this.LJFF) {
            this.LJFF = true;
            C841250WzL.LIZIZ(this, this.LIZIZ);
        }
        return this.LIZLLL != -1 ? new ByteArrayOutputStream() : this.LIZ.getOutputStream();
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final Permission getPermission() {
        return this.LIZ.getPermission();
    }

    @Override // java.net.URLConnection
    public final int getReadTimeout() {
        return this.LIZ.getReadTimeout();
    }

    @Override // java.net.HttpURLConnection
    public final String getRequestMethod() {
        return this.LIZ.getRequestMethod();
    }

    @Override // java.net.URLConnection
    public final Map<String, List<String>> getRequestProperties() {
        return this.LIZ.getRequestProperties();
    }

    @Override // java.net.HttpURLConnection
    public final int getResponseCode() {
        if (!this.LJFF) {
            this.LJFF = true;
            C841250WzL.LIZIZ(this, this.LIZIZ);
        }
        int i = this.LIZLLL;
        return i == -1 ? this.LIZ.getResponseCode() : i;
    }

    @Override // java.net.HttpURLConnection
    public final String getResponseMessage() {
        if (!this.LJFF) {
            this.LJFF = true;
            C841250WzL.LIZIZ(this, this.LIZIZ);
        }
        return this.LIZLLL != -1 ? this.LJ : this.LIZ.getResponseMessage();
    }

    @Override // java.net.URLConnection
    public final URL getURL() {
        return this.LIZ.getURL();
    }

    @Override // java.net.URLConnection
    public final boolean getUseCaches() {
        return this.LIZ.getUseCaches();
    }

    @Override // java.net.URLConnection
    public final String toString() {
        return this.LIZ.toString();
    }

    @Override // java.net.HttpURLConnection
    public final boolean usingProxy() {
        return this.LIZ.usingProxy();
    }

    @Override // X.InterfaceC841570Wzr
    public final C0WZW getExtraInfo() {
        return this.LIZJ;
    }

    @Override // java.net.URLConnection
    public final String getHeaderField(String str) {
        if (!this.LJFF) {
            this.LJFF = true;
            C841250WzL.LIZIZ(this, this.LIZIZ);
        }
        if (this.LIZLLL != -1) {
            return "";
        }
        if (this.LJIIJJI.containsKey(str)) {
            return this.LJIIJJI.get(str);
        }
        String headerField = this.LIZ.getHeaderField(str);
        this.LJIIJJI.put(str, headerField);
        return headerField;
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderFieldKey(int i) {
        return this.LIZ.getHeaderFieldKey(i);
    }

    @Override // java.net.URLConnection
    public final String getRequestProperty(String str) {
        return this.LIZ.getRequestProperty(str);
    }

    @Override // java.net.URLConnection
    public final void setAllowUserInteraction(boolean z) {
        this.LIZ.setAllowUserInteraction(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setChunkedStreamingMode(int i) {
        this.LIZ.setChunkedStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setConnectTimeout(int i) {
        this.LIZ.setConnectTimeout(i);
    }

    @Override // java.net.URLConnection
    public final void setDefaultUseCaches(boolean z) {
        this.LIZ.setDefaultUseCaches(z);
    }

    @Override // java.net.URLConnection
    public final void setDoInput(boolean z) {
        this.LIZ.setDoInput(z);
    }

    @Override // java.net.URLConnection
    public final void setDoOutput(boolean z) {
        this.LIZ.setDoOutput(z);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(int i) {
        this.LIZ.setFixedLengthStreamingMode(i);
    }

    @Override // java.net.URLConnection
    public final void setIfModifiedSince(long j) {
        this.LIZ.setIfModifiedSince(j);
    }

    @Override // java.net.HttpURLConnection
    public final void setInstanceFollowRedirects(boolean z) {
        this.LIZ.setInstanceFollowRedirects(z);
    }

    @Override // java.net.URLConnection
    public final void setReadTimeout(int i) {
        this.LIZ.setReadTimeout(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setRequestMethod(String str) throws ProtocolException {
        this.LIZ.setRequestMethod(str);
    }

    @Override // java.net.URLConnection
    public final void setUseCaches(boolean z) {
        this.LIZ.setUseCaches(z);
    }

    @Override // java.net.HttpURLConnection, java.net.URLConnection
    public final String getHeaderField(int i) {
        return this.LIZ.getHeaderField(i);
    }

    @Override // java.net.HttpURLConnection
    public final void setFixedLengthStreamingMode(long j) {
        this.LIZ.setFixedLengthStreamingMode(j);
    }

    @Override // java.net.URLConnection
    public final void addRequestProperty(String str, String str2) {
        this.LIZ.addRequestProperty(str, str2);
    }

    @Override // java.net.URLConnection
    public final int getHeaderFieldInt(String str, int i) {
        if (this.LIZLLL == -1) {
            return this.LIZ.getHeaderFieldInt(str, i);
        }
        return i;
    }

    @Override // java.net.URLConnection
    public final long getHeaderFieldLong(String str, long j) {
        if (this.LIZLLL == -1 && Build.VERSION.SDK_INT >= 24) {
            return this.LIZ.getHeaderFieldLong(str, j);
        }
        return j;
    }

    @Override // java.net.URLConnection
    public final void setRequestProperty(String str, String str2) {
        this.LIZ.setRequestProperty(str, str2);
    }

    public C842170X1z(HttpURLConnection httpURLConnection, String str, C0WZW c0wzw) {
        super(httpURLConnection.getURL());
        this.LIZ = httpURLConnection;
        this.LIZIZ = str;
        this.LIZJ = c0wzw;
        this.LIZLLL = -1;
        this.LJI = new C0X0B(httpURLConnection);
        this.LJIIJJI = new HashMap<>();
    }
}
