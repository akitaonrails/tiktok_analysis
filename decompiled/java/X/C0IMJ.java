package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0IMJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public class C0IMJ extends FrameLayout {
    public DataChannel LL;
    public final List<View> LLILLJJLI;
    public C0IKD LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public int LLILZLL;

    public int getItemSize() {
        return this.LLILZLL;
    }

    public void setDataChannel(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    public void setIView(C0IKD c0ikd) {
        this.LLILLL = c0ikd;
    }

    public C0IMJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ArrayList arrayList = new ArrayList(4);
        this.LLILLJJLI = arrayList;
        C786410Ut5.Sd(R.layout.huk, C786410Ut5.ne(context), this);
        arrayList.add(findViewById(R.id.l0y));
        arrayList.add(findViewById(R.id.l0z));
        arrayList.add(findViewById(R.id.l10));
        arrayList.add(findViewById(R.id.l11));
        this.LLILZ = findViewById(R.id.fz3);
        this.LLILZIL = findViewById(R.id.ccd);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r21, java.util.List r22) {
        /*
            Method dump skipped, instruction units count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0IMJ.LIZ(int, java.util.List):void");
    }
}
