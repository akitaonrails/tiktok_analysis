package X;

import Y.ACListenerS149S0100000_14;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.creative.model.publish.CaptionModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.ISearchService;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.services.video.IAVPublishService;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.eventtrack.HashTagMobHelper;
import com.ss.android.ugc.aweme.video.hashtag.helper.BaseTitleHelper;
import com.ss.android.ugc.aweme.video.hashtag.helper.TitleHelper;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import lth.o;

/* JADX INFO: renamed from: X.0XjP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856850XjP {
    public static final String LJJIII = C856850XjP.class.getSimpleName();
    public final InterfaceC856870XjR LIZ;
    public final C0ZI0 LIZIZ;
    public final View LIZJ;
    public final View LIZLLL;
    public final View LJ;
    public final int LJFF;
    public final BaseTitleHelper LJII;
    public final HashTagMobHelper LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public String LJIIJJI;
    public final VideoPublishEditModel LJIIL;
    public boolean LJIILIIL;
    public final C19EG LJIILL;
    public int LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public int LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public C214848196g LJJ;
    public C214848196g LJJI;
    public C855040XgU LJJIFFI;
    public String LJI = "";
    public int LJIILJJIL = -1;
    public C855530XhH LJIL = new C855530XhH();
    public final ArrayList<InterfaceC856920XjW> LJJII = new ArrayList<>();

    public final int LJFF() {
        return this.LIZIZ.getNoAdTagText().replace("\n", "").length();
    }

    public final int LJIIIIZZ() {
        return this.LIZIZ.getTotalHashtagCount();
    }

    public final void LJIILL() {
        LJIILLIIL(this.LJIJJ);
    }

    public final void LJIIZILJ() {
        C0ZI0 c0zi0 = this.LIZIZ;
        if (c0zi0.LLJILJILJ) {
            if (c0zi0.LLJJL) {
                c0zi0.setShouldDisableTrim(false);
            } else {
                c0zi0.setHasUrlTransforming(false);
                if (C2204961BRm.p(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhqMvRhYkwBv7t260=", null)) != null) {
                    C2204961BRm.p(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhqMvRhYkwBv7t260=", null)).delete(this.LIZIZ.getUrlStart(), this.LIZIZ.getUrlEnd());
                }
                C0ZI0 c0zi02 = this.LIZIZ;
                c0zi02.setUrlEnd(c0zi02.getUrlStart());
                this.LIZIZ.setTransformingUrlRemoved(true);
            }
        }
        C0ZI0 c0zi03 = this.LIZIZ;
        c0zi03.getClass();
        C0DSM.LIZ(c0zi03);
    }

    public final void LJIJ() {
        int iLIZIZ = this.LJIL.LIZIZ() + C855380Xh2.LIZ;
        if (LJFF() > iLIZIZ) {
            C0ZI0 c0zi0 = this.LIZIZ;
            if (c0zi0.LLJILJILJ) {
                return;
            }
            String strSubstring = c0zi0.getNoAdTagText().substring(0, iLIZIZ);
            C0ZI0 c0zi02 = this.LIZIZ;
            c0zi02.getClass();
            int curAdTagStart = this.LIZIZ.getCurAdTagStart();
            Editable editableP = C2204961BRm.p(c0zi02, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhisvAnsI1COnw46mruPGkfmgoDo5gyOdr+Qoa", null));
            if (editableP != null) {
                editableP.replace(0, curAdTagStart, strSubstring);
            }
        }
    }

    public static int LJI() {
        return C0CHQ.LIZ().getPublishService().LJJJJZ().LIZ();
    }

    public static boolean LJIIJ() {
        return C0CHQ.LIZ().getPublishService().LJJJJZ().LIZJ();
    }

    public final void LIZ(List<AVChallenge> list) {
        String string;
        if (C2204961BRm.p(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhqMvRhYkwBv7t260=", null)) != null && (string = C2204961BRm.p(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhqMvRhYkwBv7t260=", null)).toString()) != null) {
            ArrayList<String> arrayListLIZLLL = C856940XjY.LIZLLL(string);
            int length = string.length();
            if (!C086I.LIZIZ(list)) {
                for (AVChallenge aVChallenge : list) {
                    if (aVChallenge != null) {
                        ((HashSet) this.LIZIZ.LLJLILLLLZIIL).add("#" + aVChallenge.challengeName);
                        if (!arrayListLIZLLL.contains("#" + aVChallenge.getChallengeName())) {
                            C857030Xjh c857030XjhLIZ = C856940XjY.LIZ(length, aVChallenge.getChallengeName());
                            arrayListLIZLLL.add("#" + aVChallenge.getChallengeName());
                            if (c857030XjhLIZ.LIZIZ <= this.LJIL.LIZIZ() + C855380Xh2.LIZ) {
                                C0ZI0 c0zi0 = this.LIZIZ;
                                c0zi0.LLLLIILLL = false;
                                C2204961BRm.p(c0zi0, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhqMvRhYkwBv7t260=", null)).insert(c857030XjhLIZ.LIZ, c857030XjhLIZ.LIZJ);
                                length = c857030XjhLIZ.LIZIZ;
                            }
                            this.LIZIZ.LJJJI(true);
                        }
                    }
                }
            }
        }
    }

    public final boolean LIZLLL(boolean z) {
        int length;
        int iLIZIZ = this.LJIL.LIZIZ() + C855380Xh2.LIZ;
        if (TextUtils.isEmpty(this.LIZIZ.getAdTag()) && C2204961BRm.p(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhqMvRhYkwBv7t260=", null)) != null) {
            length = C2204961BRm.p(this.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhqMvRhYkwBv7t260=", null)).toString().replace("\n", "").length();
        } else {
            length = this.LIZIZ.getNoAdTagText().replace("\n", "").length();
        }
        int i = iLIZIZ - length;
        if (i < 0 || (i == 0 && z)) {
            String strLIZ = C856960Xja.LIZ(iLIZIZ);
            C0L5F.LIZJ(this.LJIIL);
            C0ZI0 c0zi0 = this.LIZIZ;
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.isCenterToast(this.LJIJJ);
            creativeToastBuilder.message(strLIZ);
            C1390380mHk.LIZLLL(c0zi0, 2016, creativeToastBuilder);
            return true;
        }
        return false;
    }

    public final void LJ(String str) {
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", this.LJI);
        c2344009Gk.LJIIIIZZ("enter_from", "video_post_page");
        c2344009Gk.LJIIIIZZ("enter_method", str);
        VideoPublishEditModel videoPublishEditModel = this.LJIIL;
        if (videoPublishEditModel == null) {
            str2 = "";
        } else {
            str2 = videoPublishEditModel.mShootWay;
        }
        c2344009Gk.LJIIIIZZ("shoot_way", str2);
        c2344009Gk.LJIIIIZZ("content_source", C1428470nHB.LJIILIIL(this.LJIIL));
        c2344009Gk.LJIIIIZZ("content_type", C1428470nHB.LJIILL(this.LJIIL));
        C20684815ws.LJIILLIIL("click_caption_return", c2344009Gk.LIZ);
    }

    public final String LJII(boolean z) {
        String strLJJIJIIJI = this.LIZIZ.LJJIJIIJI(z);
        if (strLJJIJIIJI == null) {
            return "";
        }
        return strLJJIJIIJI;
    }

    public final void LJIIIZ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        C0ZI0 c0zi0;
        String chain = videoPublishEditModel.getChain();
        C0CHQ.LIZ().getPublishService().LJIIJJI();
        if (C856610Xj1.LIZ(videoPublishEditModel)) {
            CaptionModel captionModel = videoPublishEditModel.creativeModel.postPageModel.captionModel;
            chain = captionModel.chain;
            z = captionModel.disableDeleteChain;
        } else {
            z = true;
        }
        if (!TextUtils.isEmpty(chain)) {
            this.LJIIIZ = chain;
            this.LJIIJ = z;
        }
        this.LIZIZ.setEmoticonFilter(0);
        this.LIZIZ.addTextChangedListener(new C856950XjZ() { // from class: X.0XjU
            {
                super("TitleModule#CaptionEditorCallbacks");
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
            
                r11 = -1;
             */
            /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
            @Override // X.C856950XjZ, android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void afterTextChanged(android.text.Editable r13) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 375
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C856900XjU.afterTextChanged(android.text.Editable):void");
            }

            @Override // X.C856950XjZ, android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                boolean z2;
                int i4;
                int iMin;
                C214848196g c214848196g;
                super.onTextChanged(charSequence, i, i2, i3);
                int i5 = i + i2;
                if (charSequence.length() != 0 && i5 >= 0 && i5 < charSequence.length()) {
                    int i6 = i3 - i2;
                    C856850XjP c856850XjP = this.LLILLJJLI;
                    boolean z3 = false;
                    if (charSequence.charAt(i5) == '\n' && i6 == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    c856850XjP.LJIILIIL = z2;
                    if (charSequence.charAt(i5) == ' ' && i6 == 1) {
                        z3 = true;
                    }
                    C856850XjP c856850XjP2 = this.LLILLJJLI;
                    if (!c856850XjP2.LJIILIIL && !z3 && (c214848196g = c856850XjP2.LJJI) != null && i3 > 0) {
                        c214848196g.LJIIJJI(i6);
                    }
                    C856850XjP c856850XjP3 = this.LLILLJJLI;
                    boolean z4 = c856850XjP3.LJIILIIL;
                    if (z4) {
                        i4 = i5;
                    } else {
                        i4 = -1;
                    }
                    c856850XjP3.LJIILJJIL = i4;
                    if (z4) {
                        c856850XjP3.LJ("type");
                    } else {
                        if (i6 <= 1 || i5 > (iMin = Math.min(i + i3, charSequence.length())) || !charSequence.subSequence(i5, iMin).toString().contains("\n")) {
                            return;
                        }
                        this.LLILLJJLI.LJ("paste");
                    }
                }
            }
        });
        if (LJIIJ()) {
            this.LIZIZ.addTextChangedListener(new C856950XjZ() { // from class: X.0XjT
                {
                    super("TitleModule#LimitHashtagCountListener");
                }

                @Override // X.C856950XjZ, android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    super.afterTextChanged(editable);
                    C856850XjP c856850XjP = this.LLILLJJLI;
                    if (c856850XjP.LJIIZILJ && c856850XjP.LJIJ) {
                        int i = c856850XjP.LJIJI;
                        if (i >= 0 && i <= editable.length()) {
                            C856850XjP c856850XjP2 = this.LLILLJJLI;
                            c856850XjP2.LIZIZ.setSelection(c856850XjP2.LJIJI);
                        }
                        this.LLILLJJLI.LJIJ = false;
                    }
                }

                @Override // X.C856950XjZ, android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    super.beforeTextChanged(charSequence, i, i2, i3);
                    C856850XjP c856850XjP = this.LLILLJJLI;
                    if (c856850XjP.LJIIZILJ && !c856850XjP.LJIJ) {
                        c856850XjP.LJIILLIIL = c856850XjP.LJIIIIZZ();
                    }
                }

                @Override // X.C856950XjZ, android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) throws Throwable {
                    int i4;
                    int i5;
                    int i6;
                    super.onTextChanged(charSequence, i, i2, i3);
                    C856850XjP c856850XjP = this.LLILLJJLI;
                    if (c856850XjP.LJIIZILJ && !c856850XjP.LJIJ && charSequence.length() != 0 && i >= 0 && (i4 = i + i3) <= charSequence.length()) {
                        try {
                            this.LLILLJJLI.getClass();
                            int iLJI = C856850XjP.LJI();
                            boolean z2 = !TextUtils.isEmpty(this.LLILLJJLI.LIZIZ.LLLIIIL);
                            List<C857030Xjh> validNoAdTagHashTagList = this.LLILLJJLI.LIZIZ.getValidNoAdTagHashTagList();
                            int size = validNoAdTagHashTagList.size();
                            if (z2) {
                                size++;
                            }
                            if (i2 > 0 && size > iLJI) {
                                C856850XjP c856850XjP2 = this.LLILLJJLI;
                                if (size > c856850XjP2.LJIILLIIL) {
                                    c856850XjP2.LJIILL();
                                }
                            }
                            if (i3 == 1) {
                                if (charSequence.charAt(i) == '#') {
                                    if (size >= iLJI) {
                                        C856850XjP c856850XjP3 = this.LLILLJJLI;
                                        if (size == c856850XjP3.LJIILLIIL) {
                                            c856850XjP3.LJIILL();
                                            Editable editableP = C2204961BRm.p(this.LLILLJJLI.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhqMvRhYkwBv7t260=", null));
                                            Objects.requireNonNull(editableP);
                                            editableP.replace(i, i + 1, "");
                                            return;
                                        }
                                    }
                                    if (size > iLJI) {
                                        C856850XjP c856850XjP4 = this.LLILLJJLI;
                                        if (size > c856850XjP4.LJIILLIIL) {
                                            c856850XjP4.LJIILL();
                                            Editable editableP2 = C2204961BRm.p(this.LLILLJJLI.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhqMvRhYkwBv7t260=", null));
                                            Objects.requireNonNull(editableP2);
                                            editableP2.replace(i, i + 1, "");
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                if (size > iLJI) {
                                    C856850XjP c856850XjP5 = this.LLILLJJLI;
                                    if (size > c856850XjP5.LJIILLIIL) {
                                        c856850XjP5.LJIILJJIL(1);
                                        Editable editableP3 = C2204961BRm.p(this.LLILLJJLI.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhqMvRhYkwBv7t260=", null));
                                        Objects.requireNonNull(editableP3);
                                        editableP3.replace(i, i + 1, "");
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            if (size > iLJI && i3 > 1) {
                                C856850XjP c856850XjP6 = this.LLILLJJLI;
                                if (size <= c856850XjP6.LJIILLIIL) {
                                    return;
                                }
                                int i7 = size - iLJI;
                                Editable editableP4 = C2204961BRm.p(c856850XjP6.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhqMvRhYkwBv7t260=", null));
                                Objects.requireNonNull(editableP4);
                                String string = editableP4.toString();
                                int size2 = validNoAdTagHashTagList.size() - 1;
                                if (size2 < 0) {
                                    return;
                                }
                                int i8 = i4 - i;
                                this.LLILLJJLI.LJIJI = -1;
                                int i9 = 0;
                                loop0: while (i7 > 0) {
                                    while (size2 >= 0) {
                                        C857030Xjh c857030Xjh = validNoAdTagHashTagList.get(size2);
                                        int i10 = c857030Xjh.LIZIZ;
                                        if (i10 > i && (i5 = c857030Xjh.LIZ) < i4) {
                                            if (i10 > i4) {
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append(string.substring(0, c857030Xjh.LIZ));
                                                sbLIZ.append(string.substring(i4));
                                                string = C2188811AlT.LIZIZ(sbLIZ);
                                                int i11 = c857030Xjh.LIZ;
                                                i6 = i4 - i11;
                                                C856850XjP c856850XjP7 = this.LLILLJJLI;
                                                int i12 = c856850XjP7.LJIJI;
                                                if (i12 == -1) {
                                                    c856850XjP7.LJIJI = i11;
                                                } else {
                                                    c856850XjP7.LJIJI = i12 - i6;
                                                }
                                                c856850XjP7.getClass();
                                            } else if (i5 != i - 1) {
                                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                                sbLIZ2.append(string.substring(0, c857030Xjh.LIZ));
                                                sbLIZ2.append(string.substring(c857030Xjh.LIZIZ));
                                                string = C2188811AlT.LIZIZ(sbLIZ2);
                                                int i13 = c857030Xjh.LIZIZ;
                                                int i14 = c857030Xjh.LIZ;
                                                i6 = i13 - i14;
                                                C856850XjP c856850XjP8 = this.LLILLJJLI;
                                                int i15 = c856850XjP8.LJIJI;
                                                if (i15 == -1) {
                                                    c856850XjP8.LJIJI = i14;
                                                } else {
                                                    c856850XjP8.LJIJI = i15 - i6;
                                                }
                                                c856850XjP8.getClass();
                                            } else {
                                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                                sbLIZ3.append(string.substring(0, i));
                                                sbLIZ3.append(string.substring(c857030Xjh.LIZIZ));
                                                string = C2188811AlT.LIZIZ(sbLIZ3);
                                                i6 = c857030Xjh.LIZIZ - i;
                                                C856850XjP c856850XjP9 = this.LLILLJJLI;
                                                int i16 = c856850XjP9.LJIJI;
                                                if (i16 == -1) {
                                                    c856850XjP9.LJIJI = i;
                                                } else {
                                                    c856850XjP9.LJIJI = i16 - i6;
                                                }
                                                c856850XjP9.getClass();
                                            }
                                            i7--;
                                            size2--;
                                            i9++;
                                            i8 -= i6;
                                            this.LLILLJJLI.getClass();
                                        } else {
                                            size2--;
                                        }
                                    }
                                    break loop0;
                                }
                                C856850XjP c856850XjP10 = this.LLILLJJLI;
                                c856850XjP10.LJIJ = true;
                                c856850XjP10.LJIILJJIL(i9);
                                Editable editableP5 = C2204961BRm.p(this.LLILLJJLI.LIZIZ, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPmgbI3ayjtq+wwhqMvRhYkwBv7t260=", null));
                                Objects.requireNonNull(editableP5);
                                Objects.requireNonNull(string);
                                editableP5.replace(i, i4, string.subSequence(i, i + i8));
                            }
                        } catch (IndexOutOfBoundsException e) {
                            TryCatchGuardChecker.doCheck(e);
                            this.LLILLJJLI.getClass();
                        }
                    }
                }
            });
        }
        String creationId = videoPublishEditModel.getCreationId();
        this.LJI = creationId;
        C0ZI0 c0zi02 = this.LIZIZ;
        if (c0zi02 != null) {
            c0zi02.setCreationId(creationId);
        }
        if (videoPublishEditModel.isDuet()) {
            C0ZI0 c0zi03 = this.LIZIZ;
            if (c0zi03 != null) {
                c0zi03.setVideoType(1);
            }
        } else if (videoPublishEditModel.isCommentReply() && (c0zi0 = this.LIZIZ) != null) {
            c0zi0.setVideoType(3);
        }
        List<AVTextExtraStruct> structList = videoPublishEditModel.getStructList();
        if (structList != null) {
            for (AVTextExtraStruct aVTextExtraStruct : structList) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("#");
                sbLIZ.append(aVTextExtraStruct.hashTagName);
                String strTrim = C2188811AlT.LIZIZ(sbLIZ).trim();
                if (!C856940XjY.LIZJ(strTrim)) {
                    ((HashSet) this.LIZIZ.LLJLILLLLZIIL).add(strTrim);
                }
            }
        }
    }

    public final void LJIIJJI(Intent intent) {
        String strLIZ;
        o.LJ.getClass();
        User userLIZ = C054C.LIZIZ.LIZ(intent);
        if (userLIZ != null) {
            C0ZI0 c0zi0 = this.LIZIZ;
            if (userLIZ.getNickname() != null) {
                strLIZ = userLIZ.getNickname();
            } else {
                strLIZ = C0HCK.LIZ(userLIZ);
            }
            c0zi0.LJIIIZ(strLIZ, userLIZ.getUid(), userLIZ.getSecUid(), false);
        }
    }

    public final void LJIIL(InterfaceC856920XjW interfaceC856920XjW) {
        ArrayList<InterfaceC856920XjW> arrayList = this.LJJII;
        interfaceC856920XjW.getClass();
        arrayList.add(interfaceC856920XjW);
    }

    public final void LJIILIIL(boolean z) {
        if (z) {
            VideoPublishEditModel videoPublishEditModel = this.LJIIL;
            IAVPublishService iAVPublishService = C1429320nIY.LIZ;
            this.LJIL = new C855520XhG(C1428470nHB.LJJZZI(videoPublishEditModel));
        } else {
            this.LJIL = new C855530XhH();
        }
        this.LIZIZ.setConfig(this.LJIL);
        C855040XgU c855040XgU = new C855040XgU();
        this.LJJIFFI = c855040XgU;
        C0ZI0 c0zi0 = this.LIZIZ;
        if (c0zi0 != null) {
            c0zi0.addTextChangedListener(new C913990ZtN(c855040XgU, 1));
        }
        if (this.LIZJ != null) {
            if (!o.LJIIZILJ.LIZ() && !((ISearchService) ServiceManager.get().getService(ISearchService.class)).LLZLI().disableHashtagSearch) {
                C786410Ut5.LJLLLLLL(0, this.LIZJ);
            } else {
                C786410Ut5.LJLLLLLL(8, this.LIZJ);
            }
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, this.LIZIZ.getContext());
        if (numLIZJ != null) {
            this.LIZIZ.setMentionTextColor(numLIZJ.intValue());
        }
        Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a1p, this.LIZIZ.getContext());
        if (numLIZJ2 != null) {
            this.LIZIZ.setPlaceHolderColor(numLIZJ2.intValue());
        }
        if (this.LIZJ != null && !o.LJIIZILJ.LIZ()) {
            C786410Ut5.I7(new ACListenerS149S0100000_14(this, 50), this.LIZJ);
        }
        if (this.LIZLLL != null) {
            C190N c190n = C190N.LIZIZ;
            if (c190n.LIZJ(false)) {
                if (this.LIZLLL instanceof TuxTextView) {
                    if (C297750Bll.LIZ()) {
                        ((TextView) this.LIZLLL).setText(this.LIZ.LL(2131844976));
                    } else {
                        ((TextView) this.LIZLLL).setText(this.LIZ.LL(2131844975));
                    }
                }
            } else if (c190n.LIZJ(true)) {
                C786410Ut5.LJLLLLLL(8, this.LIZLLL);
            }
            if (this.LIZLLL instanceof TuxTextView) {
                if (C297750Bll.LIZ()) {
                    ((TextView) this.LIZLLL).setText(this.LIZ.LL(2131844976));
                } else {
                    ((TextView) this.LIZLLL).setText(this.LIZ.LL(2131844975));
                }
            }
            C786410Ut5.I7(new ACListenerS149S0100000_14(this, 46), this.LIZLLL);
        }
        View view = this.LJ;
        if (view != null) {
            C786410Ut5.I7(new C913820Zt6(this, 0), view);
            C786410Ut5.LJLLLLLL(8, this.LJ);
        }
        if (this.LJIIJ) {
            this.LIZIZ.setFixLengthInFront(this.LJIIIZ);
            this.LIZIZ.setChainString(this.LJIIIZ);
        }
        this.LIZIZ.setHashTagView(this.LIZJ);
        this.LIZIZ.setFragmentActivity(this.LJIILL);
        this.LIZIZ.setAccountTagView(this.LIZLLL);
    }

    public final void LJIILJJIL(int i) {
        String string = this.LJIILL.getResources().getString(2131835468, Integer.valueOf(LJI()), Integer.valueOf(i));
        C19EG fragmentActivity = this.LIZ.getFragmentActivity();
        if (fragmentActivity != null) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.isCenterToast(this.LJIJJ);
            creativeToastBuilder.message(string);
            C1390380mHk.LIZ(fragmentActivity, 2061, creativeToastBuilder);
        }
    }

    public final void LJIILLIIL(final boolean z) {
        final String string = this.LJIILL.getResources().getString(2131835469, Integer.valueOf(LJI()));
        final View decorView = this.LJIILL.getWindow().getDecorView();
        if (decorView != null) {
            HandlerHook.viewPost(decorView, new Runnable() { // from class: X.0Xi5
                @Override // java.lang.Runnable
                public final void run() {
                    C856850XjP c856850XjP = this.LL;
                    View view = decorView;
                    boolean z2 = z;
                    String str = string;
                    c856850XjP.getClass();
                    C1C7U.LIZ("TitleModule@5f3a.showHashtagLimitToast$1L");
                    if (view.getParent() != null) {
                        C19EG c19eg = c856850XjP.LJIILL;
                        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                        creativeToastBuilder.isCenterToast(z2);
                        creativeToastBuilder.message(str);
                        C1390380mHk.LIZ(c19eg, 2061, creativeToastBuilder);
                    }
                    C1C7U.LIZIZ("TitleModule@5f3a.showHashtagLimitToast$1L");
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(java.util.List<java.lang.String> r20, java.util.List<java.lang.String> r21) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C856850XjP.LIZIZ(java.util.List, java.util.List):void");
    }

    public final void LIZJ(VideoPublishEditModel videoPublishEditModel, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C0CHQ.LIZ().getPublishService().LJIIJJI();
        if (C856610Xj1.LIZ(videoPublishEditModel)) {
            videoPublishEditModel.getCreativeModel().postPageModel.captionModel.chain = str;
            videoPublishEditModel.getCreativeModel().postPageModel.captionModel.disableDeleteChain = true;
        }
        videoPublishEditModel.setChain(str);
        videoPublishEditModel.setDisableDeleteChain(true);
        this.LJIIIZ = str;
        this.LJIIJ = true;
        this.LIZIZ.setFixLengthInFront(str);
        this.LIZIZ.setChainString(str);
        this.LIZIZ.setAigcPrefillPrefixEndExclusive(str.length());
    }

    public C856850XjP(InterfaceC856870XjR interfaceC856870XjR, C0ZI0 c0zi0, TuxTextView tuxTextView, TuxTextView tuxTextView2, TuxTextView tuxTextView3, int i, VideoPublishEditModel videoPublishEditModel, Scene scene) {
        String str;
        this.LIZ = interfaceC856870XjR;
        this.LIZIZ = c0zi0;
        this.LIZJ = tuxTextView;
        this.LIZLLL = tuxTextView2;
        this.LJ = tuxTextView3;
        this.LJFF = i;
        this.LJIIL = videoPublishEditModel;
        this.LJIILL = interfaceC856870XjR.getFragmentActivity();
        this.LJII = (BaseTitleHelper) C1659630tI1.LJIIIIZZ(scene, null, null, 6).get(TitleHelper.class);
        this.LJIIIIZZ = (HashTagMobHelper) C1659630tI1.LJFF(scene).get(HashTagMobHelper.class);
        if (videoPublishEditModel != null) {
            c0zi0.setVideoPublishEditModel(videoPublishEditModel);
            if (i == 0) {
                str = "video_post_page";
            } else {
                str = "edit_post_page";
            }
            c0zi0.setEnterFrom(str);
        }
        C855380Xh2.LIZ = 0;
    }
}
