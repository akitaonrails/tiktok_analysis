package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Cd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C549302Cd extends Message<C549302Cd, C569702Jz> {
    public static final ProtoAdapter<C549302Cd> ADAPTER = new ProtoAdapter<C549302Cd>() { // from class: X.026C
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C549302Cd decode(ProtoReader protoReader) {
            C549302Cd c549302Cd = new C549302Cd();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c549302Cd.ad_influencer_type = ProtoAdapter.INT32.decode(protoReader);
                                    }
                                } else {
                                    c549302Cd.link_user_info = C626602cS.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c549302Cd.has_ads_entry = ProtoAdapter.BOOL.decode(protoReader);
                            }
                        } else {
                            c549302Cd.show_star_atlas_cooperation = ProtoAdapter.BOOL.decode(protoReader);
                        }
                    } else {
                        c549302Cd.star_atlas = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c549302Cd;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C549302Cd c549302Cd) {
            C549302Cd c549302Cd2 = c549302Cd;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c549302Cd2.star_atlas);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c549302Cd2.show_star_atlas_cooperation) + protoAdapter2.encodedSizeWithTag(3, c549302Cd2.has_ads_entry) + C626602cS.ADAPTER.encodedSizeWithTag(4, c549302Cd2.link_user_info) + protoAdapter.encodedSizeWithTag(5, c549302Cd2.ad_influencer_type) + c549302Cd2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C549302Cd c549302Cd) {
            C549302Cd c549302Cd2 = c549302Cd;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c549302Cd2.star_atlas);
            ProtoAdapter<Boolean> protoAdapter2 = ProtoAdapter.BOOL;
            protoAdapter2.encodeWithTag(protoWriter, 2, c549302Cd2.show_star_atlas_cooperation);
            protoAdapter2.encodeWithTag(protoWriter, 3, c549302Cd2.has_ads_entry);
            C626602cS.ADAPTER.encodeWithTag(protoWriter, 4, c549302Cd2.link_user_info);
            protoAdapter.encodeWithTag(protoWriter, 5, c549302Cd2.ad_influencer_type);
            protoWriter.writeBytes(c549302Cd2.unknownFields());
        }
    };
    public Integer ad_influencer_type;
    public Boolean has_ads_entry;
    public C626602cS link_user_info;
    public Boolean show_star_atlas_cooperation;
    public Integer star_atlas;

    public C549302Cd() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C569702Jz newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
