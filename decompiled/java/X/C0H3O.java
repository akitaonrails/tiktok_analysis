package X;

import android.app.Activity;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.emoji.common.sysemoji.ImSysEmojiModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0H3O, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H3O extends C214906198m {
    public final Activity LL;
    public final View LLILLJJLI;
    public final C0H3P LLILLL;
    public C0H3S LLILZ;
    public ImSysEmojiModel LLILZIL;

    public final void LJJIIJ(View view) {
        view.getGlobalVisibleRect(new Rect());
        new Rect();
        this.LL.getWindow().getDecorView().getGlobalVisibleRect(new Rect());
        showAsDropDown(view, (-(getContentView().getMeasuredWidth() - view.getMeasuredWidth())) / 2, ((-view.getMeasuredHeight()) - getContentView().getMeasuredHeight()) - 21);
    }

    public C0H3O(Activity activity, C450550Hld c450550Hld) {
        super(activity);
        this.LL = activity;
        setOutsideTouchable(false);
        setFocusable(true);
        setBackgroundDrawable(new ColorDrawable(0));
        C0H3P c0h3p = new C0H3P();
        this.LLILLL = c0h3p;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(activity), R.layout.c41, c450550Hld, false);
        this.LLILLJJLI = viewTd;
        RecyclerView recyclerView = (RecyclerView) viewTd.findViewById(R.id.ms4);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity, 0, false));
        recyclerView.addItemDecoration(new C423510Gj7(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(15))));
        recyclerView.setAdapter(c0h3p);
        setContentView(viewTd);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(com.ss.android.ugc.aweme.emoji.common.sysemoji.ImSysEmojiModel r10, android.view.MotionEvent r11, android.view.View r12) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H3O.LJJIIJZLJL(com.ss.android.ugc.aweme.emoji.common.sysemoji.ImSysEmojiModel, android.view.MotionEvent, android.view.View):void");
    }
}
