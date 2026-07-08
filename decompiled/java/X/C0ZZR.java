package X;

import android.view.View;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.message.content.ShareLiveContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZZR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZZR implements C0ZZX {
    public final C869590Y9l LIZ;
    public final EnumC901750ZZd LIZIZ;
    public final View LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final ShareLiveContent LJFF;
    public final SessionInfo LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;
    public final String LJIIJ;
    public final String LJIIJJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZZR)) {
            return false;
        }
        C0ZZR c0zzr = (C0ZZR) obj;
        return Intrinsics.LJFF(this.LIZ, c0zzr.LIZ) && this.LIZIZ == c0zzr.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0zzr.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0zzr.LIZLLL) && Intrinsics.LJFF(this.LJ, c0zzr.LJ) && Intrinsics.LJFF(this.LJFF, c0zzr.LJFF) && Intrinsics.LJFF(this.LJI, c0zzr.LJI) && Intrinsics.LJFF(this.LJII, c0zzr.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0zzr.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c0zzr.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c0zzr.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c0zzr.LJIIJJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        String str = this.LIZLLL;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.LJ.hashCode()) * 31;
        ShareLiveContent shareLiveContent = this.LJFF;
        int iHashCode3 = (((iHashCode2 + (shareLiveContent == null ? 0 : shareLiveContent.hashCode())) * 31) + this.LJI.hashCode()) * 31;
        String str2 = this.LJII;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LJIIIIZZ;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.LJIIIZ;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.LJIIJ;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.LJIIJJI;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        return "CardClick(message=" + this.LIZ + ", clickSource=" + this.LIZIZ + ", view=" + this.LIZJ + ", roomId=" + this.LIZLLL + ", messageSender=" + this.LJ + ", shareLiveContent=" + this.LJFF + ", sessionInfo=" + this.LJI + ", currentPlayerTag=" + this.LJII + ", chatMessageFromUid=" + this.LJIIIIZZ + ", chatMessageGuestInviteType=" + this.LJIIIZ + ", chatGroupOwnerUid=" + this.LJIIJ + ", chatGroupUserNum=" + this.LJIIJJI + ')';
    }

    @Override // X.C0ZZX
    public final EnumC901750ZZd LIZ() {
        return this.LIZIZ;
    }

    @Override // X.C0ZZX
    public final C869590Y9l getMessage() {
        return this.LIZ;
    }

    public C0ZZR(C869590Y9l c869590Y9l, EnumC901750ZZd enumC901750ZZd, View view, String str, String str2, ShareLiveContent shareLiveContent, SessionInfo sessionInfo, String str3, String str4, String str5, String str6, String str7) {
        this.LIZ = c869590Y9l;
        this.LIZIZ = enumC901750ZZd;
        this.LIZJ = view;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = shareLiveContent;
        this.LJI = sessionInfo;
        this.LJII = str3;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = str5;
        this.LJIIJ = str6;
        this.LJIIJJI = str7;
    }
}
