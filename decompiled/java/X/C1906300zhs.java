package X;

import Y.ACListenerS139S0100000_4;
import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0zhs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@InterfaceC20647615qs("dm_message_permission_update")
public final class C1906300zhs extends AbstractC20660115st<DialogFragment> {
    public final FragmentManager LL;
    public final String LLILLJJLI;
    public final InterfaceC1887820zE4 LLILLL;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 491;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0DO5, android.view.View] */
    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        final Context context = c688120Qyw.LIZ;
        ?? r3 = new LinearLayout(context) { // from class: X.0DO5
            public TuxIconView LL;
            public ImageView LLILLJJLI;
            public TuxTextView LLILLL;
            public C197039127h LLILZ;
            public Function0<Unit> LLILZIL;

            public final ImageView getIvChatWithMorePeopleFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.lbc);
                    this.LLILLJJLI = (ImageView) callbackFindViewById;
                }
                return (ImageView) callbackFindViewById;
            }

            public final TuxIconView getIvCloseFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LL;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.lc0);
                    this.LL = (TuxIconView) callbackFindViewById;
                }
                return (TuxIconView) callbackFindViewById;
            }

            public final C197039127h getPrimaryButtonFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LLILZ;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.ru5);
                    this.LLILZ = (C197039127h) callbackFindViewById;
                }
                return (C197039127h) callbackFindViewById;
            }

            public final TuxTextView getTextBodyFromXml() {
                KeyEvent.Callback callbackFindViewById = this.LLILLL;
                if (callbackFindViewById == null) {
                    callbackFindViewById = findViewById(R.id.xla);
                    this.LLILLL = (TuxTextView) callbackFindViewById;
                }
                return (TuxTextView) callbackFindViewById;
            }

            @Override // android.view.ViewGroup, android.view.View
            public final void onAttachedToWindow() {
                super.onAttachedToWindow();
                Function0<Unit> function0 = this.LLILZIL;
                if (function0 != null) {
                    function0.invoke();
                }
            }

            public final Function0<Unit> getOnAttachCallback() {
                return this.LLILZIL;
            }

            {
                super(context, null, 0);
                setOrientation(1);
                setGravity(1);
                C786410Ut5.Sd(R.layout.cfl, C786410Ut5.ne(context), this);
                C786410Ut5.a9(getIvCloseFromXml(), new ACListenerS139S0100000_4(this, 84));
                C0HTI c0hti = new C0HTI();
                c0hti.LIZ = R.drawable.o8;
                getIvChatWithMorePeopleFromXml().setImageDrawable(c0hti.LIZ(context));
                String string = context.getString(2131832135);
                String strJ4 = C786410Ut5.j4(context.getString(2131832136), Arrays.copyOf(new Object[]{string}, 1));
                SpannableString spannableString = new SpannableString(strJ4);
                int iLJJJ = a0.LJJJ(strJ4, string, 0, false, 6);
                int length = string.length() + iLJJJ;
                if (iLJJJ >= 0 && length >= 0) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, context);
                    C786410Ut5.p2(spannableString, new ForegroundColorSpan(numLIZJ != null ? numLIZJ.intValue() : 0), iLJJJ, length, 33);
                    C786410Ut5.p2(spannableString, new C346230Dhl(context, 2), iLJJJ, length, 33);
                }
                getTextBodyFromXml().setText(spannableString);
                getTextBodyFromXml().setMovementMethod(LinkMovementMethod.getInstance());
                C786410Ut5.U8(getPrimaryButtonFromXml(), new ACListenerS139S0100000_4(this, 85));
            }

            public final void setIvChatWithMorePeopleFromXml(ImageView imageView) {
                this.LLILLJJLI = imageView;
            }

            public final void setIvCloseFromXml(TuxIconView tuxIconView) {
                this.LL = tuxIconView;
            }

            public final void setOnAttachCallback(Function0<Unit> function0) {
                this.LLILZIL = function0;
            }

            public final void setPrimaryButtonFromXml(C197039127h c197039127h) {
                this.LLILZ = c197039127h;
            }

            public final void setTextBodyFromXml(TuxTextView tuxTextView) {
                this.LLILLL = tuxTextView;
            }
        };
        r3.setOnAttachCallback(new AwS572S0100000_28(this, 1103));
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIII = r3;
        tuxSheet.show(this.LL, "MessagePermissionUpdateSheet");
        return tuxSheet;
    }

    public C1906300zhs(FragmentManager fragmentManager, String str, InterfaceC1887820zE4 interfaceC1887820zE4, InterfaceC20658015sY interfaceC20658015sY) {
        super(interfaceC20658015sY);
        this.LL = fragmentManager;
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC1887820zE4;
    }
}
