package X;

import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JFk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488940JFk extends RecyclerView.ViewHolder {
    public final DataChannel LL;
    public final C1324720kZq LLILLJJLI;
    public final C16F5 LLILLL;
    public final C197039127h LLILZ;
    public final C1324720kZq LLILZIL;
    public final LinearLayout LLILZLL;
    public C11NJ LLIZ;
    public float LLIZLLLIL;
    public float LLJ;

    public static void I5(User user) {
        UserProfileEvent userProfileEvent = new UserProfileEvent(user.getId());
        userProfileEvent.setEnigmaOutside(user.enigmaInfo);
        userProfileEvent.mReportType = "report_anchor";
        userProfileEvent.mSource = "video_head";
        userProfileEvent.mClickUserPosition = "following_card";
        userProfileEvent.isFromProgrammedLiveFollowCard = true;
        userProfileEvent.enigmaEnterFrom = "profile_card";
        C784440Upu.LIZ().LIZIZ(userProfileEvent);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void L5(boolean z) {
        int i;
        C197039127h c197039127h = this.LLILZ;
        if (c197039127h != null) {
            if (z) {
                i = 2131841701;
            } else {
                i = 2131841711;
            }
            String strLJIJI = C497740JfY.LJIJI(i);
            if (z) {
                float f = this.LLIZLLLIL;
                if (f > 0.0f) {
                    c197039127h.setTextSize(0, f);
                    c197039127h.setText(strLJIJI);
                    return;
                } else {
                    float f2 = this.LLJ;
                    if (f2 > 0.0f) {
                        c197039127h.setTextSize(0, f2);
                        c197039127h.setText(strLJIJI);
                        return;
                    }
                }
            }
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(C497740JfY.LIZIZ(16.0f));
            textPaint.setTypeface(c197039127h.getTypeface());
            float fLIZIZ = C497740JfY.LIZIZ(16.0f);
            for (float fMeasureText = textPaint.measureText(strLJIJI); fMeasureText > C497740JfY.LIZIZ(68.0f) && fLIZIZ > 0.0f; fMeasureText = textPaint.measureText(strLJIJI)) {
                fLIZIZ -= 0.5f;
                textPaint.setTextSize(fLIZIZ);
            }
            c197039127h.setTextSize(0, fLIZIZ);
            if (z) {
                this.LLIZLLLIL = fLIZIZ;
            } else {
                this.LLJ = fLIZIZ;
            }
            c197039127h.setText(strLJIJI);
        }
    }

    public C488940JFk(View view, DataChannel dataChannel) {
        super(view);
        this.LL = dataChannel;
        this.LLILLJJLI = (C1324720kZq) view.findViewById(R.id.user_avatar);
        this.LLILLL = (C16F5) view.findViewById(R.id.user_name);
        this.LLILZ = (C197039127h) view.findViewById(R.id.idt);
        this.LLILZIL = (C1324720kZq) view.findViewById(R.id.bbv);
        this.LLILZLL = (LinearLayout) view.findViewById(R.id.user_name_container);
        this.LLIZLLLIL = -1.0f;
        this.LLJ = -1.0f;
    }
}
