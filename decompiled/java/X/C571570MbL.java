package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0MbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571570MbL {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZIZ() {
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL((TextUtils.isEmpty("2160*4096") || !new Regex("[0-9]+\\*[0-9]*").matches("2160*4096")) ? "720*1280" : "2160*4096", new String[]{"*"}, 0, 6);
        return Intrinsics.LJFF(ListProtector.get(listLJJLIIIJILLIZJL, 1), "") ? new Pair(Integer.valueOf(CastIntegerProtector.parseInt((String) ListProtector.get(listLJJLIIIJILLIZJL, 0))), -1) : new Pair(Integer.valueOf(CastIntegerProtector.parseInt((String) ListProtector.get(listLJJLIIIJILLIZJL, 0))), Integer.valueOf(CastIntegerProtector.parseInt((String) ListProtector.get(listLJJLIIIJILLIZJL, 1))));
    }

    public static Pair LIZ(int i, int i2, int i3, int i4) {
        Pair pairLIZIZ = LIZIZ();
        Pair pair = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        if (((Number) pairLIZIZ.getSecond()).intValue() > 0 ? !(((Number) pair.getFirst()).intValue() > ((Number) pairLIZIZ.getFirst()).intValue() || ((Number) pair.getSecond()).intValue() > ((Number) pairLIZIZ.getSecond()).intValue()) : ((Number) pair.getFirst()).intValue() <= ((Number) pairLIZIZ.getFirst()).intValue()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C571610MbP());
            arrayList.add(new C571590MbN());
            arrayList.add(new C571600MbO(Math.max(1081, ((Number) pairLIZIZ.getFirst()).intValue())));
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Pair pairLIZIZ2 = ((InterfaceC571580MbM) it2.next()).LIZIZ(i, i3, i4);
                    if (((Boolean) pairLIZIZ2.getFirst()).booleanValue()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("isFastImport by ByteBench or not ByteBench ");
                        sbLIZ.append(pairLIZIZ2.getSecond());
                        C201955140j.LIZIZ("ByteBench", C2188811AlT.LIZIZ(sbLIZ));
                        return (Pair) pairLIZIZ2.getSecond();
                    }
                }
            }
            return new Pair(-1, Boolean.FALSE);
        }
        return new Pair(-11004, Boolean.FALSE);
    }
}
