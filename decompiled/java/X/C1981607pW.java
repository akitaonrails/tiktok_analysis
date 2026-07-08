package X;

import java.util.Map;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.07pW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1981607pW implements InterfaceC1979907pF {
    public InterfaceC1979907pF[] LIZ;
    public final String LIZIZ;
    public C1981707pX LIZJ;

    @Override // X.InterfaceC1979907pF
    public final String LIZJ() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.LIZIZ);
        sb.append(e3.h);
        InterfaceC1979907pF[] interfaceC1979907pFArr = this.LIZ;
        if (interfaceC1979907pFArr != null && interfaceC1979907pFArr.length > 0) {
            int i = 0;
            while (true) {
                InterfaceC1979907pF[] interfaceC1979907pFArr2 = this.LIZ;
                if (i >= interfaceC1979907pFArr2.length) {
                    break;
                }
                sb.append(interfaceC1979907pFArr2[i].LIZJ());
                sb.append(",");
                i++;
            }
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // X.InterfaceC1979907pF
    public final InterfaceC205300qh LIZIZ() {
        return EnumC1981807pY.METHOD;
    }

    public C1981607pW(String str) {
        this.LIZIZ = str;
    }

    @Override // X.InterfaceC1979907pF
    public final Object LIZ(Map<String, JSONObject> map) {
        C1981707pX c1981707pX = new C1981707pX();
        this.LIZJ = c1981707pX;
        c1981707pX.LIZ = this.LIZIZ;
        Object[] objArr = new Object[this.LIZ.length];
        int i = 0;
        while (true) {
            InterfaceC1979907pF[] interfaceC1979907pFArr = this.LIZ;
            if (i < interfaceC1979907pFArr.length) {
                InterfaceC1979907pF interfaceC1979907pF = interfaceC1979907pFArr[i];
                if (interfaceC1979907pF != null) {
                    objArr[i] = interfaceC1979907pF.LIZ(map);
                }
                i++;
            } else {
                this.LIZJ.LIZIZ = objArr;
                return C1976007oc.LIZ(this.LIZIZ).LIZ(map.get("default_key"), objArr);
            }
        }
    }
}
