package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02hf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C658902hf extends Message<C658902hf, C659002hg> {
    public static final ProtoAdapter<C658902hf> ADAPTER = new ProtoAdapter<C658902hf>() { // from class: X.02he
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C658902hf decode(ProtoReader protoReader) {
            C658902hf c658902hf = new C658902hf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c658902hf.badge_thumb = C673002jw.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c658902hf.honor_score = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c658902hf.honor_level = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c658902hf;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C658902hf c658902hf) {
            C658902hf c658902hf2 = c658902hf;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c658902hf2.honor_level) + ProtoAdapter.INT64.encodedSizeWithTag(2, c658902hf2.honor_score) + C673002jw.ADAPTER.encodedSizeWithTag(3, c658902hf2.badge_thumb) + c658902hf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C658902hf c658902hf) {
            C658902hf c658902hf2 = c658902hf;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c658902hf2.honor_level);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 2, c658902hf2.honor_score);
            C673002jw.ADAPTER.encodeWithTag(protoWriter, 3, c658902hf2.badge_thumb);
            protoWriter.writeBytes(c658902hf2.unknownFields());
        }
    };
    public C673002jw badge_thumb;
    public Integer honor_level;
    public Long honor_score;

    public C658902hf() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C659002hg newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
