package X;

import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import com.ss.android.ugc.aweme.creative.model.common.MentionDataItem;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.1ANj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2178411ANj implements C0DV5<C2178411ANj> {
    public String LL;
    public String LLILLJJLI;
    public List<String> LLILLL;
    public String LLILZ;
    public String LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public String LLIZLLLIL;
    public String LLJ;
    public String LLJI;
    public String LLJIJIL;
    public C0LN8 LLJILJIL;
    public boolean LLJILJILJ = true;
    public boolean LLJILLL = true;
    public List<InputBlock> LLJJ;
    public Function1<? super MentionDataItem, Unit> LLJJI;
    public Function1<? super String, Unit> LLJJIII;
    public Function2<? super Long, ? super String, Unit> LLJJIJI;
    public InterfaceC1631620sYq<? super Integer, ? super String, ? super String, Unit> LLJJIJIIJIL;

    @Override // X.C0DV5
    public C2178411ANj build() {
        return this;
    }

    @Override // X.C0DV5
    public /* bridge */ /* synthetic */ C0DV5 build() {
        build();
        return this;
    }

    public final String getAuthorName() {
        return this.LLIZLLLIL;
    }

    public final boolean getAuthorNameVisible() {
        return this.LLJILLL;
    }

    public final String getAuthorUid() {
        return this.LLJ;
    }

    public final String getAvatarUrl() {
        return this.LLJI;
    }

    public final boolean getAvatarVisible() {
        return this.LLJILJILJ;
    }

    public final String getDescription() {
        return this.LLJIJIL;
    }

    public final C0LN8 getFileResourceType() {
        return this.LLJILJIL;
    }

    public final List<InputBlock> getMentionBlocks() {
        return this.LLJJ;
    }

    public final Function1<String, Unit> getOnAuthorNameClick() {
        return this.LLJJIII;
    }

    public final Function2<Long, String, Unit> getOnFirstFrame() {
        return this.LLJJIJI;
    }

    public final Function1<MentionDataItem, Unit> getOnMentionClick() {
        return this.LLJJI;
    }

    public final InterfaceC1631620sYq<Integer, String, String, Unit> getOnPlayError() {
        return this.LLJJIJIIJIL;
    }

    public final String getSourceId() {
        return this.LL;
    }

    public final String getVideoCoverUrl() {
        return this.LLILZIL;
    }

    public final int getVideoHeight() {
        return this.LLIZ;
    }

    public final String getVideoUri() {
        return this.LLILZ;
    }

    public final String getVideoUrl() {
        return this.LLILLJJLI;
    }

    public final List<String> getVideoUrls() {
        return this.LLILLL;
    }

    public final int getVideoWidth() {
        return this.LLILZLL;
    }

    public final C2178411ANj setAuthorName(String str) {
        this.LLIZLLLIL = str;
        return this;
    }

    public final C2178411ANj setAuthorNameVisible(boolean z) {
        this.LLJILLL = z;
        return this;
    }

    public final C2178411ANj setAuthorUid(String str) {
        this.LLJ = str;
        return this;
    }

    public final C2178411ANj setAvatarUrl(String str) {
        this.LLJI = str;
        return this;
    }

    public final C2178411ANj setAvatarVisible(boolean z) {
        this.LLJILJILJ = z;
        return this;
    }

    public final C2178411ANj setDescription(String str) {
        this.LLJIJIL = str;
        return this;
    }

    public final C2178411ANj setFileResourceType(C0LN8 c0ln8) {
        this.LLJILJIL = c0ln8;
        return this;
    }

    public final C2178411ANj setMentionBlocks(List<InputBlock> list) {
        this.LLJJ = list;
        return this;
    }

    public final C2178411ANj setOnAuthorNameClick(Function1<? super String, Unit> function1) {
        this.LLJJIII = function1;
        return this;
    }

    public final C2178411ANj setOnFirstFrame(Function2<? super Long, ? super String, Unit> function2) {
        this.LLJJIJI = function2;
        return this;
    }

    public final C2178411ANj setOnMentionClick(Function1<? super MentionDataItem, Unit> function1) {
        this.LLJJI = function1;
        return this;
    }

    public final C2178411ANj setOnPlayError(InterfaceC1631620sYq<? super Integer, ? super String, ? super String, Unit> interfaceC1631620sYq) {
        this.LLJJIJIIJIL = interfaceC1631620sYq;
        return this;
    }

    public final C2178411ANj setSourceId(String str) {
        this.LL = str;
        return this;
    }

    public final C2178411ANj setVideoCoverUrl(String str) {
        this.LLILZIL = str;
        return this;
    }

    public final void setVideoHeight(int i) {
        this.LLIZ = i;
    }

    public final C2178411ANj setVideoUri(String str) {
        this.LLILZ = str;
        return this;
    }

    public final C2178411ANj setVideoUrl(String str) {
        this.LLILLJJLI = str;
        this.LLILLL = Collections.singletonList(str);
        return this;
    }

    public final C2178411ANj setVideoUrls(List<String> list) {
        this.LLILLL = list;
        String str = (String) C13LP.LJJJLL(list);
        if (str != null) {
            this.LLILLJJLI = str;
        }
        return this;
    }

    public final void setVideoWidth(int i) {
        this.LLILZLL = i;
    }

    /* JADX INFO: renamed from: setAuthorName, reason: collision with other method in class */
    public final void m101setAuthorName(String str) {
        this.LLIZLLLIL = str;
    }

    /* JADX INFO: renamed from: setAuthorNameVisible, reason: collision with other method in class */
    public final void m102setAuthorNameVisible(boolean z) {
        this.LLJILLL = z;
    }

    /* JADX INFO: renamed from: setAuthorUid, reason: collision with other method in class */
    public final void m103setAuthorUid(String str) {
        this.LLJ = str;
    }

    /* JADX INFO: renamed from: setAvatarUrl, reason: collision with other method in class */
    public final void m104setAvatarUrl(String str) {
        this.LLJI = str;
    }

    /* JADX INFO: renamed from: setAvatarVisible, reason: collision with other method in class */
    public final void m105setAvatarVisible(boolean z) {
        this.LLJILJILJ = z;
    }

    /* JADX INFO: renamed from: setDescription, reason: collision with other method in class */
    public final void m106setDescription(String str) {
        this.LLJIJIL = str;
    }

    /* JADX INFO: renamed from: setFileResourceType, reason: collision with other method in class */
    public final void m107setFileResourceType(C0LN8 c0ln8) {
        this.LLJILJIL = c0ln8;
    }

    /* JADX INFO: renamed from: setMentionBlocks, reason: collision with other method in class */
    public final void m108setMentionBlocks(List<InputBlock> list) {
        this.LLJJ = list;
    }

    /* JADX INFO: renamed from: setOnAuthorNameClick, reason: collision with other method in class */
    public final void m109setOnAuthorNameClick(Function1<? super String, Unit> function1) {
        this.LLJJIII = function1;
    }

    /* JADX INFO: renamed from: setOnFirstFrame, reason: collision with other method in class */
    public final void m110setOnFirstFrame(Function2<? super Long, ? super String, Unit> function2) {
        this.LLJJIJI = function2;
    }

    /* JADX INFO: renamed from: setOnMentionClick, reason: collision with other method in class */
    public final void m111setOnMentionClick(Function1<? super MentionDataItem, Unit> function1) {
        this.LLJJI = function1;
    }

    /* JADX INFO: renamed from: setOnPlayError, reason: collision with other method in class */
    public final void m112setOnPlayError(InterfaceC1631620sYq<? super Integer, ? super String, ? super String, Unit> interfaceC1631620sYq) {
        this.LLJJIJIIJIL = interfaceC1631620sYq;
    }

    /* JADX INFO: renamed from: setSourceId, reason: collision with other method in class */
    public final void m113setSourceId(String str) {
        this.LL = str;
    }

    /* JADX INFO: renamed from: setVideoCoverUrl, reason: collision with other method in class */
    public final void m114setVideoCoverUrl(String str) {
        this.LLILZIL = str;
    }

    /* JADX INFO: renamed from: setVideoUri, reason: collision with other method in class */
    public final void m115setVideoUri(String str) {
        this.LLILZ = str;
    }

    /* JADX INFO: renamed from: setVideoUrl, reason: collision with other method in class */
    public final void m116setVideoUrl(String str) {
        this.LLILLJJLI = str;
    }

    /* JADX INFO: renamed from: setVideoUrls, reason: collision with other method in class */
    public final void m117setVideoUrls(List<String> list) {
        this.LLILLL = list;
    }

    public final C2178411ANj setVideoSize(int i, int i2) {
        this.LLILZLL = i;
        this.LLIZ = i2;
        return this;
    }
}
