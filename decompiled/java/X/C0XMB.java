package X;

import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.FormUrlEncodedTypedOutput;
import com.bytedance.retrofit2.mime.TypedOutput;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0XMB, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public class C0XMB {
    public String LIZ;
    public String LIZIZ;
    public List<C080U> LIZJ;
    public TypedOutput LIZLLL;
    public final AbstractC842530X3j LJ;
    public int LJFF;
    public int LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public final boolean LJIIIZ;
    public final int LJIIJ;
    public Object LJIIJJI;
    public String LJIIL;
    public final C1494570ozn LJIILIIL;
    public Map<Class<?>, Object> LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;

    public final Request LIZ() {
        if (this.LIZIZ != null) {
            return new Request(this);
        }
        throw new IllegalStateException("url == null");
    }

    public C0XMB() {
        this.LIZ = "GET";
    }

    public C0XMB(Request request) {
        this.LIZ = request.method;
        this.LIZIZ = request.url;
        LinkedList linkedList = new LinkedList();
        this.LIZJ = linkedList;
        linkedList.addAll(request.headers);
        this.LIZLLL = request.body;
        this.LJ = request.requestBody;
        this.LJFF = request.priorityLevel;
        this.LJI = request.requestPriorityLevel;
        this.LJII = request.responseStreaming;
        this.LJIIIIZZ = request.maxLength;
        this.LJIIIZ = request.addCommonParam;
        this.LJIIJ = request.commonParamLevel;
        this.LJIIJJI = request.extraInfo;
        this.LJIIL = request.serviceType;
        this.LJIILIIL = request.metrics;
        this.LJIILJJIL = request.tags;
        this.LJIILL = request.isQueryEncryptEnabled;
        this.LJIILLIIL = request.isBodyEncryptEnabled;
    }

    public final void LIZJ(String str) {
        if (str != null) {
            this.LIZIZ = str;
            return;
        }
        throw new NullPointerException("url == null");
    }

    public final void LIZIZ(TypedOutput typedOutput, String str) {
        TypedOutput typedOutput2;
        if (str != null) {
            if (str.length() != 0) {
                if (typedOutput != null) {
                    typedOutput2 = typedOutput;
                    if (!C2396109aB.LJIIL(str)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("method ");
                        sbLIZ.append(str);
                        sbLIZ.append(" must not have a request body.");
                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    typedOutput2 = typedOutput;
                    if (C2396109aB.LJIILIIL(str)) {
                        FormUrlEncodedTypedOutput formUrlEncodedTypedOutput = new FormUrlEncodedTypedOutput();
                        formUrlEncodedTypedOutput.addField("body", "null");
                        typedOutput2 = formUrlEncodedTypedOutput;
                    }
                }
                this.LIZ = str;
                this.LIZLLL = typedOutput2;
                return;
            }
            throw new IllegalArgumentException("method.length() == 0");
        }
        throw new NullPointerException("method == null");
    }
}
