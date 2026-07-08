package X;

import android.view.View;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.multilive.model.AiPlaybookSummary;
import com.bytedance.bddatefmt.BDDateFormat;
import com.zhiliaoapp.musically.R;
import java.util.Locale;

/* JADX INFO: renamed from: X.14uD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20413514uD extends AbstractC960470b6L<AiPlaybookSummary> {
    public final InterfaceC20409614ta LL;
    public C1324720kZq LLILLJJLI;
    public C16F5 LLILLL;
    public C16F5 LLILZ;
    public C16F5 LLILZIL;

    public final void L5(final AiPlaybookSummary aiPlaybookSummary) {
        this.LLILLJJLI = (C1324720kZq) this.itemView.findViewById(R.id.qoj);
        this.LLILLL = (C16F5) this.itemView.findViewById(R.id.qol);
        this.LLILZ = (C16F5) this.itemView.findViewById(R.id.qoi);
        this.LLILZIL = (C16F5) this.itemView.findViewById(R.id.qok);
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(ImageModel.genBy(aiPlaybookSummary.coverUrl));
        c1324610kZfLJIIIZ.LJJ = Boolean.TRUE;
        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.f3f;
        c1324610kZfLJIIIZ.LJJI(this.LLILLJJLI);
        C16F5 c16f5 = this.LLILLL;
        if (c16f5 != null) {
            c16f5.setText(aiPlaybookSummary.title);
        }
        C16F5 c16f52 = this.LLILZ;
        if (c16f52 != null) {
            c16f52.setText(aiPlaybookSummary.roomTitleDescription);
        }
        C16F5 c16f53 = this.LLILZIL;
        if (c16f53 != null) {
            c16f53.setText(new BDDateFormat("LLL").LIZIZ(aiPlaybookSummary.liveCreateTime, Locale.getDefault()));
        }
        C1570050qxX.LIZ(new View.OnClickListener() { // from class: X.14uE
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC20409614ta interfaceC20409614ta = this.LL.LL;
                if (interfaceC20409614ta != null) {
                    interfaceC20409614ta.LIZ(aiPlaybookSummary);
                }
            }
        }, this.itemView);
    }

    public C20413514uD(View view, InterfaceC20409614ta interfaceC20409614ta) {
        super(view);
        this.LL = interfaceC20409614ta;
    }

    @Override // X.AbstractC960470b6L
    public final /* bridge */ /* synthetic */ void I5(int i, Object obj) {
        L5((AiPlaybookSummary) obj);
    }
}
