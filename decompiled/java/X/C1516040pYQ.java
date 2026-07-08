package X;

import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.k;
import com.google.gson.m;
import com.google.gson.q;
import com.ss.android.ugc.aweme.ecommerce.chunk.EcomParallelChunkPreferModel;
import java.util.List;
import kotlin.jvm.internal.AwS106S1200000_23;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0pYQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516040pYQ<T> implements InterfaceC1501660pBE<TypedInput, C1515820pY4<T>> {
    public final Gson LIZ;
    public final TypeAdapter<T> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final List<EcomParallelChunkPreferModel> LJ;
    public final int LJFF;

    public static String LIZIZ(C1516060pYS c1516060pYS) {
        if (c1516060pYS == null) {
            return "none";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("type=");
        sbLIZ.append(c1516060pYS.LIZIZ);
        sbLIZ.append(',');
        sbLIZ.append(LIZJ(c1516060pYS.LIZ));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZJ(EcomParallelChunkPreferModel ecomParallelChunkPreferModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("path=");
        sbLIZ.append(ecomParallelChunkPreferModel.path);
        sbLIZ.append(",defer=");
        sbLIZ.append(LIZLLL(ecomParallelChunkPreferModel.defer));
        sbLIZ.append(",prefer=");
        sbLIZ.append(LIZLLL(ecomParallelChunkPreferModel.prefer));
        sbLIZ.append(",timeout=");
        sbLIZ.append(ecomParallelChunkPreferModel.timeout);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL(k kVar) {
        if (kVar != null && !(kVar instanceof m)) {
            if (kVar instanceof q) {
                q qVarLJIILJJIL = kVar.LJIILJJIL();
                Object obj = qVarLJIILJJIL.LL;
                if (obj instanceof Boolean) {
                    return String.valueOf(qVarLJIILJJIL.LJ());
                }
                if (obj instanceof Number) {
                    return qVarLJIILJJIL.LJJIFFI().stripTrailingZeros().toPlainString();
                }
                return qVarLJIILJJIL.LJIL();
            }
            return kVar.toString();
        }
        return "null";
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.0pYP] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.0pYP] */
    @Override // X.InterfaceC1501660pBE
    public final Object LIZ(TypedInput typedInput) {
        C1515820pY4<byte[]> c1515820pY4LIZ;
        TypedInput typedInput2 = typedInput;
        String strMimeType = typedInput2.mimeType();
        C1515670pXp c1515670pXp = new C1515670pXp(typedInput2.in());
        if (this.LIZJ) {
            final C1515820pY4<byte[]> c1515820pY4LIZ2 = c1515670pXp.LIZ();
            c1515820pY4LIZ = new C1515840pY6(new InterfaceC644200POo() { // from class: X.0pYJ
                @Override // X.InterfaceC644200POo
                public final void LIZ(C0POE<T> c0poe) {
                    c1515820pY4LIZ2.LIZLLL(new C1515960pYI(c1515820pY4LIZ2, c0poe));
                }
            }, c1515820pY4LIZ2);
        } else {
            c1515820pY4LIZ = c1515670pXp.LIZ();
        }
        String str = "UTF-8";
        String charset = MimeUtil.parseCharset(strMimeType, "UTF-8");
        if (charset != null) {
            str = charset;
        }
        new AwS567S0100000_23(this, (C1516040pYQ<Object>) 204);
        C034X.LIZIZ();
        final AwS106S1200000_23 awS106S1200000_23 = new AwS106S1200000_23(str, (String) this, (C1516040pYQ<Object>) c1515820pY4LIZ, (C1515820pY4<byte[]>) 6);
        if (!this.LJ.isEmpty()) {
            return new C1515840pY6(new C1516150pYb(this, c1515820pY4LIZ, new InterfaceC1515570pXf() { // from class: X.0pYP
                @Override // X.InterfaceC1515570pXf
                public final /* synthetic */ Object apply(Object obj) {
                    return awS106S1200000_23.invoke(obj);
                }
            }), c1515820pY4LIZ);
        }
        if (this.LIZLLL) {
            return new C1515840pY6(new C1516070pYT(c1515820pY4LIZ, new InterfaceC1515570pXf() { // from class: X.0pYP
                @Override // X.InterfaceC1515570pXf
                public final /* synthetic */ Object apply(Object obj) {
                    return awS106S1200000_23.invoke(obj);
                }
            }), c1515820pY4LIZ);
        }
        return c1515820pY4LIZ.LIZJ(new InterfaceC1515570pXf() { // from class: X.0pYP
            @Override // X.InterfaceC1515570pXf
            public final /* synthetic */ Object apply(Object obj) {
                return awS106S1200000_23.invoke(obj);
            }
        });
    }

    public C1516040pYQ(Gson gson, TypeAdapter<T> typeAdapter, boolean z, boolean z2, List<EcomParallelChunkPreferModel> list, int i) {
        this.LIZ = gson;
        this.LIZIZ = typeAdapter;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = list;
        this.LJFF = i;
    }
}
