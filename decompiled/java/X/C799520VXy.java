package X;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import com.bytedance.tt.reliability.monitor.bundlechecker.BundleAndIntentLancet;
import com.bytedance.tt.reliability.monitor.bundlechecker.BundleTooLargeChecker;
import java.io.Serializable;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0VXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C799520VXy {
    public static final Bundle LIZ(Pair<String, ? extends Object>... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair<String, ? extends Object> pair : pairArr) {
            String first = pair.getFirst();
            Object second = pair.getSecond();
            if (second == null) {
                C786410Ut5.LJJJI(first, null, bundle);
            } else if (second instanceof Boolean) {
                bundle.putBoolean(first, ((Boolean) second).booleanValue());
            } else if (second instanceof Byte) {
                bundle.putByte(first, ((Number) second).byteValue());
            } else if (second instanceof Character) {
                bundle.putChar(first, ((Character) second).charValue());
            } else if (second instanceof Double) {
                bundle.putDouble(first, ((Number) second).doubleValue());
            } else if (second instanceof Float) {
                bundle.putFloat(first, ((Number) second).floatValue());
            } else if (second instanceof Integer) {
                bundle.putInt(first, ((Number) second).intValue());
            } else if (second instanceof Long) {
                bundle.putLong(first, ((Number) second).longValue());
            } else if (second instanceof Short) {
                bundle.putShort(first, ((Number) second).shortValue());
            } else if (second instanceof Bundle) {
                C786410Ut5.LJJIIZI(bundle, (Bundle) second, first);
            } else if (second instanceof CharSequence) {
                C786410Ut5.LJJIJIIJI(bundle, first, (CharSequence) second);
            } else if (second instanceof Parcelable) {
                C786410Ut5.LJJIJL(bundle, first, (Parcelable) second);
            } else if (second instanceof boolean[]) {
                bundle.putBooleanArray(first, (boolean[]) second);
            } else if (second instanceof byte[]) {
                C786410Ut5.LJJIJ(bundle, first, (byte[]) second);
            } else if (second instanceof char[]) {
                char[] cArr = (char[]) second;
                if (cArr.length > BundleAndIntentLancet.CHAR_LIMIT_SIZE) {
                    BundleTooLargeChecker.recordBundleTooLargePoint(first, cArr);
                }
                bundle.putCharArray(first, cArr);
            } else if (second instanceof double[]) {
                bundle.putDoubleArray(first, (double[]) second);
            } else if (second instanceof float[]) {
                C786410Ut5.LJJIJIIJIL(bundle, first, (float[]) second);
            } else if (second instanceof int[]) {
                bundle.putIntArray(first, (int[]) second);
            } else if (second instanceof long[]) {
                bundle.putLongArray(first, (long[]) second);
            } else if (second instanceof short[]) {
                short[] sArr = (short[]) second;
                if (sArr.length > BundleAndIntentLancet.SHORT_LIMIT_SIZE) {
                    BundleTooLargeChecker.recordBundleTooLargePoint(first, sArr);
                }
                bundle.putShortArray(first, sArr);
            } else if (second instanceof Object[]) {
                Class<?> componentType = second.getClass().getComponentType();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    C786410Ut5.LJJIJLIJ(bundle, first, (Parcelable[]) second);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(first, (String[]) second);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    CharSequence[] charSequenceArr = (CharSequence[]) second;
                    BundleTooLargeChecker.recordBundleTooLargePoint(first, charSequenceArr);
                    bundle.putCharSequenceArray(first, charSequenceArr);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    C786410Ut5.LJJIZ(bundle, first, (Serializable) second);
                } else {
                    String canonicalName = componentType.getCanonicalName();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Illegal value array type ");
                    sbLIZ.append(canonicalName);
                    sbLIZ.append(" for key \"");
                    sbLIZ.append(first);
                    sbLIZ.append('\"');
                    throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                }
            } else if (second instanceof Serializable) {
                C786410Ut5.LJJIZ(bundle, first, (Serializable) second);
            } else if (second instanceof IBinder) {
                C786410Ut5.LJJIIZ(bundle, (IBinder) second, first);
            } else if (second instanceof Size) {
                C799530VXz.LIZ(bundle, first, (Size) second);
            } else if (second instanceof SizeF) {
                C799530VXz.LIZIZ(bundle, first, (SizeF) second);
            } else {
                String canonicalName2 = second.getClass().getCanonicalName();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Illegal value type ");
                sbLIZ2.append(canonicalName2);
                sbLIZ2.append(" for key \"");
                sbLIZ2.append(first);
                sbLIZ2.append('\"');
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
        return bundle;
    }
}
