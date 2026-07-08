package X;

import android.text.Editable;
import android.text.TextWatcher;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.detail.prefab.SearchBarAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinBoardEditAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.BulletinEditAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.publishpanel.BulletinPublishPanelInputAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.assem.BulletinCommentKeyboardInputAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.comment.vm.BulletinCommentActionViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinEditViewModel;
import com.ss.android.ugc.aweme.inbox.bulletin.viewmodel.BulletinProfileViewModel;
import com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel;
import com.ss.android.ugc.aweme.music.search.title.SearchMusicTitleAssem;
import com.ss.android.ugc.aweme.topic.review.panel.TopicReviewPanel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.AwS60S1000000_9;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0P4X, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4X implements TextWatcher {
    public final int $t;
    public Object l0;

    public static final void afterTextChanged$0(C0P4X c0p4x, Editable editable) {
    }

    public static final void afterTextChanged$3(C0P4X c0p4x, Editable editable) {
    }

    public static final void afterTextChanged$5(C0P4X c0p4x, Editable editable) {
    }

    public static final void beforeTextChanged$0(C0P4X c0p4x, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C0P4X c0p4x, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C0P4X c0p4x, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$3(C0P4X c0p4x, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$4(C0P4X c0p4x, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$5(C0P4X c0p4x, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$6(C0P4X c0p4x, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C0P4X c0p4x, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$4(C0P4X c0p4x, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$6(C0P4X c0p4x, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) throws Throwable {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
            case 2:
                afterTextChanged$2(this, editable);
                break;
            case 3:
                afterTextChanged$3(this, editable);
                break;
            case 4:
                afterTextChanged$4(this, editable);
                break;
            case 5:
                afterTextChanged$5(this, editable);
                break;
            case 6:
                afterTextChanged$6(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                beforeTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                beforeTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                beforeTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                beforeTextChanged$6(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                break;
            case 3:
                onTextChanged$3(this, charSequence, i, i2, i3);
                break;
            case 4:
                onTextChanged$4(this, charSequence, i, i2, i3);
                break;
            case 5:
                onTextChanged$5(this, charSequence, i, i2, i3);
                break;
            case 6:
                onTextChanged$6(this, charSequence, i, i2, i3);
                break;
        }
    }

    public C0P4X(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void afterTextChanged$1(C0P4X c0p4x, Editable editable) {
        ((SearchBarAssem) c0p4x.l0).lp(editable.toString());
    }

    public static final void afterTextChanged$2(C0P4X c0p4x, Editable editable) throws Throwable {
        String string;
        String str;
        ((BulletinEditAssem) c0p4x.l0).hp();
        BulletinEditAssem bulletinEditAssem = (BulletinEditAssem) c0p4x.l0;
        if (editable != null) {
            bulletinEditAssem.getClass();
            string = editable.toString();
        } else {
            string = null;
        }
        if (!((List) bulletinEditAssem.LLJLILLLLZIIL.getValue()).isEmpty() && string != null && string.length() != 0) {
            C0OOY.LIZ.getClass();
            List listLJFF = C0OOY.LJFF(string);
            if (listLJFF != null && (str = (String) C13LP.LJJJLZIJ(0, listLJFF)) != null && str.length() != 0) {
                C382201e8 c382201e8 = C382201e8.LIZ;
                String strCQ2 = ((BulletinProfileViewModel) bulletinEditAssem.LLJJJ.getValue()).CQ2();
                c382201e8.getClass();
                if (C382201e8.LIZ(str, strCQ2)) {
                    bulletinEditAssem.op().LLJI = "1";
                    BulletinEditViewModel bulletinEditViewModelOp = bulletinEditAssem.op();
                    bulletinEditViewModelOp.getClass();
                    bulletinEditViewModelOp.setState(new AwS60S1000000_9(str, 14));
                } else {
                    bulletinEditAssem.op().LLJI = null;
                    BulletinEditViewModel bulletinEditViewModelOp2 = bulletinEditAssem.op();
                    bulletinEditViewModelOp2.getClass();
                    bulletinEditViewModelOp2.setState(new AwS60S1000000_9(null, 14));
                }
            } else {
                bulletinEditAssem.op().LLJI = null;
                BulletinEditViewModel bulletinEditViewModelOp3 = bulletinEditAssem.op();
                bulletinEditViewModelOp3.getClass();
                bulletinEditViewModelOp3.setState(new AwS60S1000000_9(null, 14));
            }
        } else {
            bulletinEditAssem.op().LLJI = null;
            BulletinEditViewModel bulletinEditViewModelOp4 = bulletinEditAssem.op();
            bulletinEditViewModelOp4.getClass();
            bulletinEditViewModelOp4.setState(new AwS60S1000000_9(null, 14));
        }
        if (!((ArrayList) ((BulletinEditAssem) c0p4x.l0).LLJLIL).isEmpty() && C0C64.LJIILLIIL().LJIIIZ(31744, "bulletin_gameplay_second_function_setting", true, true)) {
            AnonymousClass0956 anonymousClass0956 = ((BulletinEditAssem) c0p4x.l0).LLJL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            BulletinEditAssem bulletinEditAssem2 = (BulletinEditAssem) c0p4x.l0;
            bulletinEditAssem2.LLJL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(bulletinEditAssem2), null, null, new C1532205zE((BulletinEditAssem) c0p4x.l0, editable, null), 3);
        }
    }

    public static final void afterTextChanged$4(C0P4X c0p4x, Editable editable) throws Throwable {
        if (editable != null) {
            TopicReviewPanel topicReviewPanel = (TopicReviewPanel) c0p4x.l0;
            topicReviewPanel.VR();
            topicReviewPanel.WR();
        }
    }

    public static final void afterTextChanged$6(C0P4X c0p4x, Editable editable) {
        String string;
        boolean z;
        if (editable == null || (string = editable.toString()) == null) {
            string = "";
        }
        BulletinCommentActionViewModel bulletinCommentActionViewModelGo = ((BulletinCommentKeyboardInputAssem) c0p4x.l0).Go();
        bulletinCommentActionViewModelGo.getClass();
        bulletinCommentActionViewModelGo.setState(new AwS60S1000000_9(string, 17));
        C197039127h c197039127h = (C197039127h) ((BulletinCommentKeyboardInputAssem) c0p4x.l0).LJJIJL().findViewById(R.id.czu);
        if (c197039127h != null) {
            if (string.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            c197039127h.setEnabled(z);
        }
    }

    public static final void onTextChanged$0(C0P4X c0p4x, CharSequence charSequence, int i, int i2, int i3) {
        if (charSequence != null) {
            BulletinBoardEditAssem bulletinBoardEditAssem = (BulletinBoardEditAssem) c0p4x.l0;
            int i4 = 1;
            if (160 - charSequence.length() <= 10) {
                TuxTextView tuxTextView = bulletinBoardEditAssem.LLJJI;
                if (tuxTextView != null) {
                    tuxTextView.setText(C786410Ut5.j4("%d/%d", Arrays.copyOf(new Object[]{Integer.valueOf(charSequence.length()), 160}, 2)));
                }
                TuxTextView tuxTextView2 = bulletinBoardEditAssem.LLJJI;
                if (tuxTextView2 != null) {
                    C12ES.LJIILL(0, tuxTextView2);
                }
            } else {
                TuxTextView tuxTextView3 = bulletinBoardEditAssem.LLJJI;
                if (tuxTextView3 != null) {
                    C0DTR.LIZIZ(tuxTextView3);
                }
            }
            if (i3 > 0) {
                C0OP5 c0op5 = C0OP5.LJI;
                if (Intrinsics.LJFF(charSequence.toString(), bulletinBoardEditAssem.LLJJIJIL)) {
                    i4 = 2;
                }
                c0op5.LJIIL(i4, "has_input_description");
            }
            String string = charSequence.toString();
            C618340ONc c618340ONc = bulletinBoardEditAssem.LLJILJIL;
            if (c618340ONc != null) {
                c618340ONc.LIZIZ = string;
            }
            bulletinBoardEditAssem.Lo().LLJI = string;
            bulletinBoardEditAssem.Go();
        }
    }

    public static final void onTextChanged$2(C0P4X c0p4x, CharSequence charSequence, int i, int i2, int i3) {
        BulletinEditViewModel bulletinEditViewModelOp = ((BulletinEditAssem) c0p4x.l0).op();
        String strValueOf = String.valueOf(charSequence);
        bulletinEditViewModelOp.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setText() - bulletinId = ");
        sbLIZ.append(bulletinEditViewModelOp.LLILZLL);
        sbLIZ.append(", text = ");
        sbLIZ.append(strValueOf);
        C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
        bulletinEditViewModelOp.LLILZ = true;
        bulletinEditViewModelOp.LLILLJJLI = strValueOf;
        if (charSequence != null && charSequence.length() != 0) {
            if (a0.LJLIIIL(charSequence).length() == 0) {
                ((BulletinEditAssem) c0p4x.l0).op().AQ2(false);
            } else {
                ((BulletinEditAssem) c0p4x.l0).op().AQ2(true);
            }
            ((BulletinEditAssem) c0p4x.l0).up(Integer.valueOf(charSequence.length()));
            return;
        }
        TuxTextView tuxTextView = ((BulletinEditAssem) c0p4x.l0).LLJJJJ;
        if (tuxTextView != null) {
            C0DTR.LIZIZ(tuxTextView);
        }
        ((BulletinEditAssem) c0p4x.l0).op().AQ2(false);
    }

    public static final void onTextChanged$3(C0P4X c0p4x, CharSequence charSequence, int i, int i2, int i3) {
        String strValueOf = String.valueOf(charSequence);
        AssemVMLazy assemVMLazy = ((SearchMusicTitleAssem) c0p4x.l0).LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = SearchMusicTitleAssem.LLJIJIL;
        SearchMusicListViewModel searchMusicListViewModel = (SearchMusicListViewModel) assemVMLazy.getValue();
        searchMusicListViewModel.LLILZIL = strValueOf;
        searchMusicListViewModel.refresh();
    }

    public static final void onTextChanged$5(C0P4X c0p4x, CharSequence charSequence, int i, int i2, int i3) {
        ((BulletinPublishPanelInputAssem) c0p4x.l0).hp().LL = String.valueOf(charSequence);
    }
}
