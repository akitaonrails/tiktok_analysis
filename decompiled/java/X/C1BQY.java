package X;

import com.bytedance.vmsdk.jsbridge.utils.ReadableMap;
import com.bytedance.vmsdk.jsbridge.utils.ReadableType;
import com.google.gson.m;
import com.google.gson.n;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1BQY, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BQY extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ ReadableMap LL;
    public final /* synthetic */ n LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1BQY(ReadableMap readableMap, n nVar) {
        super(1);
        this.LL = readableMap;
        this.LLILLJJLI = nVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String str2 = str;
        ReadableType type = this.LL.getType(str2);
        if (type != null) {
            switch (C2204601BQc.LIZ[type.ordinal()]) {
                case 1:
                    this.LLILLJJLI.LJJIFFI(str2, m.LL);
                    break;
                case 2:
                    this.LLILLJJLI.LJJII(Boolean.valueOf(this.LL.getBoolean(str2)), str2);
                    break;
                case 3:
                    this.LLILLJJLI.LJJIII(Integer.valueOf(this.LL.getInt(str2)), str2);
                    break;
                case 4:
                    this.LLILLJJLI.LJJIII(Long.valueOf(this.LL.getLong(str2)), str2);
                    break;
                case 5:
                    this.LLILLJJLI.LJJIII(Double.valueOf(this.LL.getDouble(str2)), str2);
                    break;
                case 6:
                    this.LLILLJJLI.LJJIIJ(str2, this.LL.getString(str2));
                    break;
                case 7:
                    this.LLILLJJLI.LJJIFFI(str2, C1BQX.LIZLLL(this.LL.getMap(str2)));
                    break;
                case 8:
                    this.LLILLJJLI.LJJIFFI(str2, C1BQX.LIZJ(this.LL.getArray(str2)));
                    break;
            }
        }
        return Unit.LIZ;
    }
}
