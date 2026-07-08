package X;

import Y.ACListenerS155S0100000_21;
import Y.ATListenerS454S0100000_21;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.viewmodel.ShareDialogViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ljD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1368970ljD extends ConstraintLayout {
    public C0I7D LL;
    public LinearLayout LLILLJJLI;
    public final View LLILLL;
    public final EditText LLILZ;
    public final ImageView LLILZIL;
    public ShareDialogViewModel LLILZLL;
    public Function0<Unit> LLIZ;

    public final C0I7D getSearchEtFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.u_1);
            this.LL = (C0I7D) callbackFindViewById;
        }
        return (C0I7D) callbackFindViewById;
    }

    public final LinearLayout getSearchLyFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.uc2);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final void setEditClickCallBack(Function0<Unit> function0) {
        this.LLIZ = function0;
    }

    public final void setKeyBoardVisibilityListener(LifecycleOwner lifecycleOwner) {
        KeyboardUtils.LIZ(lifecycleOwner, this.LLILZ, new InterfaceC1242460iRA() { // from class: X.0ljF
            @Override // X.InterfaceC1242460iRA
            public final /* synthetic */ void onShow() {
            }

            @Override // X.InterfaceC1242460iRA
            public final void onHide() {
                this.LL.LLILZ.clearFocus();
            }
        });
    }

    public final void setListViewModel(ShareDialogViewModel shareDialogViewModel) {
        this.LLILZLL = shareDialogViewModel;
    }

    public final void setSearchEtFromXml(C0I7D c0i7d) {
        this.LL = c0i7d;
    }

    public final void setSearchLyFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public C1368970ljD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1368970ljD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View viewLIZ = C21146717pB.LIZ(context, R.layout.cqt, this);
        this.LLILLL = viewLIZ;
        EditText editText = (EditText) viewLIZ.findViewById(R.id.u_1);
        this.LLILZ = editText;
        ImageView imageView = (ImageView) viewLIZ.findViewById(R.id.coo);
        this.LLILZIL = imageView;
        String strLIZ = C1368910lj7.LIZ(2131835514);
        if (strLIZ != null) {
            editText.setHint(strLIZ);
        }
        editText.setOnKeyListener(new View.OnKeyListener() { // from class: X.0ljE
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
                List<? extends IMContact> listLJJJJJ;
                if (i2 != 66) {
                    if (i2 == 67 && keyEvent.getAction() == 1) {
                        ShareDialogViewModel shareDialogViewModel = this.LL.LLILZLL;
                        if (shareDialogViewModel != null) {
                            String value = shareDialogViewModel.LLILZIL.getValue();
                            if (value == null) {
                                value = "";
                            }
                            if (value.length() != 0) {
                                return false;
                            }
                        }
                        ShareDialogViewModel shareDialogViewModel2 = this.LL.LLILZLL;
                        if (shareDialogViewModel2 != null) {
                            List<IMContact> value2 = shareDialogViewModel2.LLJ.getValue();
                            if (value2 == null || (listLJJJJJ = C13LP.LJJJJJ(1, value2)) == null) {
                                listLJJJJJ = C13BV.INSTANCE;
                            }
                            shareDialogViewModel2.AQ2(listLJJJJJ);
                        }
                        return true;
                    }
                    return false;
                }
                C1368970ljD c1368970ljD = this.LL;
                c1368970ljD.LLILZ.clearFocus();
                KeyboardUtils.LIZIZ(c1368970ljD.LLILZ);
                return true;
            }
        });
        editText.setOnTouchListener(new ATListenerS454S0100000_21(this, 11));
        C502760Jne.LIZ(context, editText);
        C786410Ut5.N7(editText, new ACListenerS155S0100000_21(this, 74));
        editText.addTextChangedListener(new C1402120mag(this, 7));
        C786410Ut5.Q7(imageView, new ACListenerS155S0100000_21(this, 75));
    }
}
