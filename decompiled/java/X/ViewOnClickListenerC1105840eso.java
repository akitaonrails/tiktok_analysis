package X;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideDialogWidget;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAdjustFollowGuideStrategySetting;
import com.bytedance.android.livesdk.model.message.GuideMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.zhiliaoapp.musically.R;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0eso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class ViewOnClickListenerC1105840eso extends DialogC1118080fCY implements View.OnClickListener {
    public TextView LLJILJILJ;
    public final User LLJILLL;
    public GuideMessage LLJJ;
    public C1105860esq LLJJI;

    @Override // X.DialogC1118080fCY, X.C19GI, X.DialogC21505919Ej, android.app.Dialog
    public final void onStart() throws JSONException {
        super.onStart();
        getWindow().setLayout(-1, -1);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1105860esq c1105860esq;
        if (view.getId() == R.id.idt && (c1105860esq = this.LLJJI) != null) {
            FollowGuideDialogWidget followGuideDialogWidget = c1105860esq.LIZ;
            followGuideDialogWidget.LLILLL.removeCallbacks(followGuideDialogWidget.LLJJI);
            c1105860esq.LIZ.D1();
        }
        if (view.getId() == R.id.yg_) {
            cancel();
            C1105860esq c1105860esq2 = this.LLJJI;
            if (c1105860esq2 != null) {
                FollowGuideDialogWidget followGuideDialogWidget2 = c1105860esq2.LIZ;
                followGuideDialogWidget2.LLILLL.removeCallbacks(followGuideDialogWidget2.LLJJI);
                ViewOnClickListenerC1105840eso viewOnClickListenerC1105840eso = c1105860esq2.LIZIZ;
                viewOnClickListenerC1105840eso.dismiss();
                C785410UrT.LIZ(viewOnClickListenerC1105840eso);
                FollowGuideDialogWidget followGuideDialogWidget3 = c1105860esq2.LIZ;
                followGuideDialogWidget3.M1("click_exit", followGuideDialogWidget3.W1(true));
                c1105860esq2.LIZ.LLILZIL = null;
            }
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        GuideMessage guideMessage;
        super.onCreate(bundle);
        setContentView(R.layout.ga4);
        ImageView imageView = (ImageView) findViewById(R.id.bh2);
        TextView textView = (TextView) findViewById(R.id.p09);
        C786410Ut5.LLJJIII((C1324720kZq) findViewById(R.id.b0r), 8);
        TextView textView2 = (TextView) findViewById(R.id.fof);
        TextView textView3 = (TextView) findViewById(R.id.idt);
        this.LLJILJILJ = textView3;
        C786410Ut5.T7(textView3, this);
        View viewFindViewById = findViewById(R.id.yg_);
        View viewFindViewById2 = findViewById(R.id.a2s);
        C786410Ut5.I7(this, viewFindViewById);
        C786410Ut5.I7(this, viewFindViewById2);
        C1121670fIL.LJIIL(imageView, this.LLJILLL.getAvatarThumb(), R.drawable.eze);
        textView.setText(C0KVU.LIZ(this.LLJILLL));
        if (LiveAdjustFollowGuideStrategySetting.INSTANCE.getValue() && (guideMessage = this.LLJJ) != null) {
            String str = guideMessage.scene;
            if (TextUtils.equals(str, "rewatch")) {
                textView2.setText(2131840646);
                return;
            } else if (!TextUtils.equals(str, "gift") && !TextUtils.equals(str, "comment")) {
                textView2.setText(2131841710);
                return;
            } else {
                textView2.setText(2131840645);
                return;
            }
        }
        textView2.setText(2131841710);
    }

    public ViewOnClickListenerC1105840eso(Context context, Room room, boolean z) {
        super(context, z);
        this.LLJILLL = room.getOwner();
    }
}
