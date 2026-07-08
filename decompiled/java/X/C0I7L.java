package X;

import android.app.Activity;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import u4.q0;

/* JADX INFO: renamed from: X.0I7L, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I7L {
    public static boolean LIZ(DragEvent dragEvent, TextView textView, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            q0.LJIILIIL(textView, new C462560IBy(dragEvent.getClipData(), 3).LIZ.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean LIZIZ(DragEvent dragEvent, View view, Activity activity) {
        activity.requestDragAndDropPermissions(dragEvent);
        q0.LJIILIIL(view, new C462560IBy(dragEvent.getClipData(), 3).LIZ.build());
        return true;
    }
}
